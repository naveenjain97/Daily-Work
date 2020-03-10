<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ref2" class="com.cts.mvc.example.LoginBean" scope="application">
</jsp:useBean>
<jsp:getProperty property="userName" name="ref2"/>
<jsp:getProperty property="password" name="ref2"/>
<a href="logout.jsp">Logout</a>
</body>
</html>