<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String fname=request.getParameter("firstname"); 
 String lname=request.getParameter("lastname"); 
 String login=request.getParameter("loginid"); 
 String pass=request.getParameter("password"); %>
<%= fname %><br>
<%= lname %><br>
<%= login %><br>
<%= pass %>

</body>
</html>