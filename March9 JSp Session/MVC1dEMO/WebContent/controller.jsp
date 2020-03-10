<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

 session.setMaxInactiveInterval(5);   %>
<!-- com.cts.mvc.examole.loginBean ref =new LoginBean ()  -->
<jsp:useBean id="ref" class="com.cts.mvc.example.LoginBean" scope="application">
</jsp:useBean>

<!--  ref.setName(request.getparameter("userName"))  -->
<jsp:setProperty property="userName" name="ref"/>
<!--  ref.setpassword(request.getparameter("password"))  -->
<jsp:setProperty property="password" name="ref"/>
<jsp:forward page="view.jsp"/>
</body>
</html>