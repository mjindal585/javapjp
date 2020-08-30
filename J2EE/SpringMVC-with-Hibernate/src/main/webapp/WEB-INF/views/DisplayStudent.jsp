<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.wipro.bean.Student"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>Student Name</th>
<th>Address</th>
</tr>
<c:forEach var="temp" items="${listStudent}" >
            <tr>                
			<td>${temp.StudentName }</td>
			<td>${temp.Address }</td>
            </tr>
</c:forEach>
</table>
</body>
</html>