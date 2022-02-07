package com.auribises.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.auribises.model.User;


public class HomeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		// 2. Session Tracking with URL ReWriting - Reading the data
		String uid = request.getParameter("uid");
		String name = request.getParameter("name");
		String regsitered = request.getParameter("registered");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><body>");
		buffer.append("<center>");
		buffer.append("<br><br><h3>Welcome to Home</h3>");
		buffer.append("<p>Its: "+new Date()+"</p>");
		
		// 1. Session Tracking with Cookies - Reading the data
		// Read all the cookies stored for our app in the browser on client machine
		Cookie[] cookieArray = request.getCookies();
		
		for(Cookie cookie : cookieArray) {
			buffer.append("<p>"+cookie.getName()+" ~ "+cookie.getValue()+"</p>");
		}
		
		// Generate HTML Text
		
		// 1. Session Tracking with HttpSession - Reading the data
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("keyUser");
		

		buffer.append("<p> [URL ReWriting] USER ID: "+uid+" NAME: "+name+" REGSITERED: "+regsitered+"</p>");
		buffer.append("<p> [HTTP Session]  USER ID: "+user.uid+" NAME: "+user.name+" REGSITERED: "+user.registeredOn+"</p>");
		buffer.append("</center>");
		buffer.append("</body></html>");
		
		out.print(buffer.toString());
	}

}
