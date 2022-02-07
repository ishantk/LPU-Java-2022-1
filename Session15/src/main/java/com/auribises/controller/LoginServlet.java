package com.auribises.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.auribises.db.DB;
import com.auribises.model.User;


public class LoginServlet extends HttpServlet {

	DB db;
	
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("[LoginServlet] init");
		db = DB.getDB();
	}

	
	public void destroy() {
		System.out.println("[LoginServlet] init");
		db.closeConnection();
	}

	
	// can handle only post requests from client
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginServlet] doPost");
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println("[LoginServlet] "+user);
		
		String sql = user.toRegisterSQL(); // select query
		System.out.println("[LoginServlet] "+sql);
		
		ResultSet set = db.executeQuery(user.toLoginSQL());
		
		boolean isRowAvailale = false;
		String message = "";
		//String urlToHome = "<p><a href='Welcome'>Click to Naviagte to Home</a></p>";
		try {
			isRowAvailale = set.next();
			
			if(isRowAvailale) {
				user.uid = set.getInt("uid");
				user.name = set.getString("name");
				user.registeredOn = set.getString("registeredOn");
				
				// 2. Session Tracking with URL ReWriting - Writing the data
				String queryString = "Welcome?uid="+user.uid+"&name="+user.name+"&registered="+user.registeredOn;
				String urlToHome = "<p><a href='"+queryString+"'>Click to Naviagte to Home</a></p>";
				
				
				// Assignment: Process it here and in Home Servlet
				// 4. Session Tracking with Hidden Form Field - Writing the data
				String formToHome = "<form action='Welcome' method='post'>"
						+ "<input type='hidden' name='txtUID' value='"+user.uid+"'>"
						+ "<input type='hidden' name='txtName' value='"+user.name+"'>"
						+ "<input type='submit' value='Navigate to Home'>"
						+ "</form>";
				
				message = "<h3>Login Successfull for "+user.name+"</h3>"
						+ urlToHome;
				
				
				// 1. Session Tracking with Cookies - Writing the data
				
				// Cookie is a HashMap of key value pair
				// It is stored in client's machine i.e. in the Browser
				Cookie cookie1 = new Cookie("keyName", user.name);
				Cookie cookie2 = new Cookie("keyEmail", user.email);
				//Cookie cookie3 = new Cookie("keyRegisteredDateTime", user.registeredOn);
				Cookie cookie4 = new Cookie("keyUID", String.valueOf(user.uid));
				
				//cookie1.setMaxAge();   // if we wish to get the cookies eliminated define a max age limit 
				//cookie1.setVersion(1); // read the cookies based on versions :)
				
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				//response.addCookie(cookie3);
				response.addCookie(cookie4);
				
				// 3. Session Tracking with HTTPSession - Writing the data
				HttpSession session = request.getSession();
				session.setAttribute("keyUser", user);
				
			}else {
				message = "<h3>Login Failed for "+user.name+"<h3>";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// Send Back Response to the client
		// Using HttpServletResponse we can send text or html back to the client
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		// Generate HTML Text
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		buffer.append("<center>");
		buffer.append("<br><br><h3>"+message+"</h3>");
		buffer.append("<p>Registered On: "+user.uid+" | "+user.registeredOn+"</p>");
		buffer.append("</center>");
		buffer.append("</body></html>");
		
		// Send HTML text as Response
		out.print(buffer.toString());		
		
	}

}
