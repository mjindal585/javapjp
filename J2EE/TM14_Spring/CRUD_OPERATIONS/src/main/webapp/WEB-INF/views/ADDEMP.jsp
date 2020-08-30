<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
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
<sp:form action="AddEmployee" modelAttribute="ed">
<table>
<tr><th colspan="2">Add New Employee Details</th></tr>
<tr><td>Employee Name:</td><td><sp:input path="Name" required="required"/></td></tr>
<tr><td>Gender:</td><td><sp:input path="Gender" required="required"/></td></tr>
<tr><td>Designation:</td><td><sp:input path="Designation" required="required"/></td></tr>
<tr><td>Email:</td><td><sp:input path="Email" required="required"/></td></tr>
<tr><td>City:</td><td><sp:input path="City" required="required"/></td></tr>
<tr><td>Salary:</td><td><sp:input path="Salary" required="required"/></td></tr>
<tr><td>Phone:</td><td><sp:input path="Phone" required="required"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Submit"/>
</table>
</sp:form>
</div>
</body>
</html>