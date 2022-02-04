package com.auribises.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		
		try {
			isRowAvailale = set.next();
			
			if(isRowAvailale) {
				user.uid = set.getInt("uid");
				user.name = set.getString("name");
				user.registeredOn = set.getString("registeredOn");
				message = "<h3>Login Successfull for "+user.name+"</h3>";
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
