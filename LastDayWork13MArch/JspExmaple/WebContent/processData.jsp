<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   errorPage="ErrorHandler.jsp"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a=0,b=0,result; %>
<%a=Integer.parseInt(request.getParameter("t1"));
b=Integer.parseInt(request.getParameter("t2")); 
result=a+b;
out.write("<h1>Result="+result+"</h1>");%>
</body>
</html>