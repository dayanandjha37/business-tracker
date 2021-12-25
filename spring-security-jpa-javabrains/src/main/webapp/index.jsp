<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<center>
<%@include file="header.jsp" %>
<form action="/login" method="POST">
Enter username:<input type="text" name="username"><br>
Enter password:<input type="password" name="password"><br>
<input type="submit" value="Login">
<br><a href="/registration">|Create a new account|</a>

</form>
</center>
</body>
</html>