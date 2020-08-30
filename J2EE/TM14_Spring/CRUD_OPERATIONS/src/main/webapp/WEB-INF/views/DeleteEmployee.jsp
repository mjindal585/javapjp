<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
           <%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
<style>
div{
border:1pt solid green;
position:absolute;
left:40%;
top:30%;
trsanform:translate(-50%,-50%);
}
table,th,td{
text-align:"center";
border:1pt solid black;
}
</style>
</head>
<body>
<div>
<sp:form action="DeleteEmpById" modelAttribute="ed">
<table>
<tr><th colspan="2">Delete Employee Details</th></tr>
<tr><td>Employee ID:</td><td><sp:input path="id" required="required"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Submit"/>
</table>
</sp:form>
</div>
</body>
</html>