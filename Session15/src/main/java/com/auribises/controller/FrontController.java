package com.auribises.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Capture the type of request from the client by reading hidden form field
		String requestType = request.getParameter("txtType");
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		// Generate HTML Text
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		buffer.append("<center>");
		buffer.append("<br><br><h3>Welcome to Front Controller</h3>");
		
		String urlPatternToServlet = "";
		
		if(requestType.equals("register")) {
			urlPatternToServlet = "Register"; // For RegisterServlet
		}else if(requestType.equals("login")) {
			urlPatternToServlet = "Auth";     // For LoginServlet
		}else {
			buffer.append("<p>We cannot process your Request.</p>");
		}
		
		if(!urlPatternToServlet.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(urlPatternToServlet);
			
			// forward method on Request Dispatcher
			// forwards the control to the corresponding Servlet and response from the corresponding Servlet is shared back
			//dispatcher.forward(request, response);
			
			// include method on Request Dispatcher
			// forwards the control to the corresponding Servlet and 
			// response from the corresponding Servlet and FrontController Servlet is shared back
			dispatcher.include(request, response);
		}
		
		
		buffer.append("</center>");
		buffer.append("</body></html>");
		
		out.print(buffer.toString());
		
	}

}
