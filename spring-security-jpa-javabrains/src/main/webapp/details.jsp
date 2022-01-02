<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><%@include file="headerafterlogin.jsp" %><h2>
Name:${user.rname}<br>
Username: ${user.username}<br>
Role:${user.roles }<br>
Mobile:${user.umobile }
</center></h2>
</body>
</html>