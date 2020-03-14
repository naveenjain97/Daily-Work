<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
user="root"
password="root"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/ctspune"
/>
<%-- <sql:update>
insert into emp values (50,'Naveen','Indore',56455)
</sql:update>
 --%>
<%-- <sql:update>
update emp set name='pulkit' where id=1
</sql:update> --%>

<sql:query var ="rs" sql="select * from emp">
</sql:query>

<table style="border: 1px solid black; width:50%;">
<c:forEach var="row" items="${rs.rows}">

<tr>
<td style="border: 1px solid black;padding:10px;width:50%;"><c:out value="${row.id}"/></td>

<td style="border: 1px solid black;padding:10px;width:50%;"><c:out value="${row.name}"/></td>

<td style="border: 1px solid black;padding:10px;width:50%;"><c:out value="${row.city}"/></td>

<td style="border: 1px solid black;padding:10px;width:50%;"><c:out value="${row.pincode}"/></td>
</tr>


</c:forEach>
</table>

</body>
</html>