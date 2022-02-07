<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>
<%@ include file="header.jsp" %>

<html>
<head>

<style type="text/css">
	.content {
		max-width: 500px;
		margin: auto;
	}
</style>

<meta charset="UTF-8">
<title>Welcome to JSP</title>
</head>
<body>
	
	<div class="content">
	
		<p>Three Tags in JSP</p>
		<ul>
			<li>Scriptlet</li>
			<li>Declarative</li>
			<li>Expression</li>
		</ul>
	
		<%-- Name is not accessible: <h3> Name is: <% out.print(name); %></h3> --%>
		
		<%-- <h3>App Name is: <% out.print(appName); %></h3> --%>
		<p>Expression Tag</p>
		<!-- Replacement to out.print() -->
		<h3>App Name is: <%= appName %></h3>
		<h3>Users: <%= getAppUsers() %></h3>
		<h3>Registration: <%= registerUser("leo@example.com", "leo123") %></h3>
	
		<h3>Welcome to JSP Page :)</h3>
			
		<p>Scriptlet Tag</p>
		<%
			String name = "John";
			int age = 12;
			if(age > 18){
		%>
			<h3>YOU CAN VOTE</h3>		
		<%
			}else{
				out.print(name+" cannot vote");
			}
		%>
	
		<p>Declarative Tag</p>
		<%!
			String appName = "eStore";
			
			int getAppUsers(){
				return 120;
			}
			
			String registerUser(String email, String password){
				return "User Registered with "+email;
			}
		
			int[] cashBacks = {90, 88, 20, 45, 100};
			
		%>

		<h3> Name is: <% out.print(name); %></h3>
		<h3>CashBack for Lucky Number 3 is: <%= cashBacks[3] %></h3>
		
		<!-- Action Tag -->
		<jsp:include page="header.jsp"/>
		
		
	</div>

	
		
</body>
</html>