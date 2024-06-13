<%@ page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here is your help</title>
</head>
<body>

    
    <!-- This is your second way using EL -->
    <h1>Hello, my name is ${name1}</h1>
    <h1>Hello, my roll number is ${rollnumber1}</h1>
    <h1>This is my date and time ${time}</h1>

    <hr>

    <!-- Using JSTL to iterate over marks -->
    <c:forEach var="item" items="${marks}">
        <h1><c:out value="${item}" /></h1>
    </c:forEach>

</body>
</html>
