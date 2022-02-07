<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<jsp:include page="header.jsp"/>
		
		<%
			String message = request.getParameter("message");
		%>
		
		<h3>Welcome to Home</h3>
		<p><%= message %></p>
	</center>
</body>
</html>