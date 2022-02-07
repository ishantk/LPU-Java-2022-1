<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h3>Something Went Wrong !!</h3>
		<!-- exception reference varible is an implicit object given to us for exception handling -->
		<p>Exception is: <%= exception %></p>  
	</center>
</body>
</html>