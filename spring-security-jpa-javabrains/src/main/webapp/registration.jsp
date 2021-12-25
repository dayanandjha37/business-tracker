<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%@ include file="header.jsp"%>
		<form action="/regvalidate" method="post">
			<table border="1">
				<tr>
					<td>Enter name:</td>
					<td><input type="text" name="rname"></td>
				</tr>
				<tr>
					<td>Enter username to set:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Enter password to set:</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td>Enter email id:</td>
					<td><input type="email" name="uemail"></td>
				</tr>
				<tr>
					<td>Enter mobile number:</td>
					<td><input type="text" name="umobile"></td>
				</tr>

			</table>

			<br> <input type="submit" value="Submit">
		</form>
	</center>
</body>
</html>