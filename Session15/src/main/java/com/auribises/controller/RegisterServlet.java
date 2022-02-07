package com.auribises.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.auribises.db.DB;
import com.auribises.model.User;


public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	DB db;
	
	// Serve as Constructor
	// We do initializations here
	public void init(ServletConfig config) throws ServletException {
		System.out.println("[RegisterServlet] - init");
		db = DB.getDB();
	}

	// Serve as Destructor
	// May be save some data before destruction or close connections
	public void destroy() {
		System.out.println("[RegisterServlet] - destroy");
		db.closeConnection();
	}

	// Which will be executed whenever a new request comes from the client
	// can handle both get and post requests from client
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("[RegisterServlet] - service");
		
		// Procesing the Request from Client
		
		// 1. Create User Object
		User user = new User();
		
		// 2. From the HttpServletRequest get the data and put it in object
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println("[RegisterServlet] "+user);
		String sql = user.toRegisterSQL();
		System.out.println("[RegisterServlet] "+sql);
		
		int result = db.executeUpdate(sql);
		String message = result > 0 ? user.name+" Thank You For Registering with us" 
						            : user.name+" Registration Failed. Please try Again";
		
		// Send Back Response to the client
		// Using HttpServletResponse we can send text or html back to the client
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		// Generate HTML Text
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		buffer.append("<center>");
		buffer.append("<br><br><h3>"+message+"</h3>");
		buffer.append("<p>Registered On: "+user.registeredOn+"</p>");
		buffer.append("</center>");
		buffer.append("</body></html>");
		
		// Send HTML text as Response
		out.print(buffer.toString());

	}

}

// Assignment1:
// Use Java's Security Package and Hash the Passwords using SHA technique
// Explore the API MessageDigest :)

// Assignment2:
// Implement DAO Design Pattern in this current project :)
