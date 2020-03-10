<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

import="java.util.Date"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- declaration Tag -->
<%!
int count=0;
%>
<!-- ScripletTag -->
<%
count++;

%>
<!-- Expression Tag -->

<h1>today Date is as....<%=new Date() %></h1>
<hr/><hr/>
<h1>today Date is as....<%=new Date() %></h1>
</body>
</html>