<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> From useData.jsp File</h1>
<% 
String Company =request.getParameter("Company1");
String Company1 =request.getParameter("Company2");
out.write("<h1>"+Company+"&nbsp;&nbsp"+Company1+"</h1>");
%>
</body>
</html>