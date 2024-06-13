<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
    <h1>This is the home page</h1>
    <h1>Called by HomeController</h1>
    <h1>URL: /home</h1>

    <%
    String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
    List<String> friends = (List<String>) request.getAttribute("f");
    %>
    
    <h1>Name is <%= name %> </h1>
    <h1>Id is <%= id %></h1>

    <%
    if (friends != null) {
        for (String friend : friends) {
    %>
            <h1><%= friend %></h1>
    <%
        }
    } else {
    %>
        <h1>No friends found</h1>
    <%
    }
    %>

</body>
</html>
