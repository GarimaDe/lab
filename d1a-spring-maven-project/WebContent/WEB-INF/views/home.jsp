<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Home page
${message}<br> 
${day }
<form action="user method="get">
<input type="text" name="userName"/>
<br>
<input type = "submit" value="Submit"/>
</form>
</body>
</html>