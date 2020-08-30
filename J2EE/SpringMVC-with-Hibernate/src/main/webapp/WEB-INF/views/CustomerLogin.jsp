<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="sd" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<style>
div{
position:fixed;
    top: 50%;
    left: 50%;
    width:30em;
    height:18em;
    margin-top: -9em; 
    margin-left: -15em; 
    border: 1px solid #ccc;
    background-color: #f3f3f3;
}
</style>
<meta charset="ISO-8859-1">
<title>Customer Login</title>
</head>
<body>
<div>
<sd:form action="AfterLogin" modelAttribute="cst">
<table border="1">
<tr><th colspan="2" align="center">ENTER THE CUSTOMER LOGIN DETAILS</th></tr>
<tr>
<td>Customer ID:</td>
<td><sd:input path="CustomerID" /></td>
</tr>
<tr>
<td>Password</td>
<td><sd:input path="Password"/> </td>
</tr>
<tr><td colspan="2" align="center"><input type="Submit" value="Login"/></td></tr>
</table>

</sd:form>
</div>
</body>
</html>