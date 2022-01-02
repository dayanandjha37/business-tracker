<%@page import="org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder"%>
<%@page import="io.javabrains.springsecurityjpajavabrains.Entity.User"%>
<%@page import="io.javabrains.springsecurityjpajavabrains.service.MyUserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<center><%@include file="headerafterlogin.jsp" %>
<h1>Welcome ${user.rname}! [${user.roles}]</h1>

</center>
</body>
</html>