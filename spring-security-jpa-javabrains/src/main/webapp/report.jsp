<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reports</title>
</head>
<body>
<center><%@include file="headerafterlogin.jsp" %>
<form action="/product/upload" method="post" enctype="multipart/form-data"">
<p>Click on the "Choose File" button to upload a file:</p>
  <input type="file" name="file" accept=".xlsx"><br><br>
  <input type="submit">
  </center>
</form>

</body>
</html>