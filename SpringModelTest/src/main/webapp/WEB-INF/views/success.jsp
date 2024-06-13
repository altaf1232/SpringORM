<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>It is your Success Page</title>
</head>
<body>
    
   
   <h1 style="color:green">${message}</h1>
    <!-- This is your second way -->
    <h1>Welcome, this is your email: ${user.email}</h1>
    <h1>Welcome, this is your name: ${user.userName}</h1>
    <h1>Welcome, this is your passWord: ${user.passWord}</h1>
</body>
</html>