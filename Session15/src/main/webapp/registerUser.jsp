<%@ page import="com.auribises.db.DB"%>
<%@ page import="com.auribises.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<title>User Registration</title>
</head>
<body>

	<div class="mt-4 p-5 bg-primary text-white rounded">
		    <h1>REGISTER - eStore</h1> 
		    <p>You can Shop a Variety of Products from electronics to toys to grocery</p>
		    <p>One Stop Solution for your daily needs</p>  
	   </div>
	   

	<%
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		String sql = user.toRegisterSQL();
		
		DB db = DB.getDB();
		int result = db.executeUpdate(sql);
		
		if(result>0){
	%>
		<h3>Thank You for Registering with Us. Your Email <%= user.email %> is registered with us</h3>			
		<!-- <a href="">Click to Navigate to Home</a> -->
		<jsp:forward page="home.jsp">
			<jsp:param value="Welcome to eStore | <%= user.name %>" name="message"/>
		</jsp:forward>
	<%	
		}else{
	%>
		<h3>Registration Failed for <%= user.email %>></h3>
	<%		
		}
	
	%>
	
	<!-- Assignment: Explore the Action Tag: useBean -->

</body>
</html>