<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sd" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Registration page</title>   

</head>    
<body>    
    <h1 align="center"> User Registration Form </h1> 
    <sd:form action="AfterRegister" modelAttribute="ud">  
        <div > 
        <p>${msg}</p>
        <table>  
           <tr><td> User-name : </td>   
           <td><sd:input path="Username" required="required"/></td></tr>  
            <tr><td>Password :</td>
            <td><sd:input path="Password" /></td></tr>  
            <tr><td>Employee ID :</td>
            <td><sd:input path="EmployeeID" /></td></tr>
            <tr><td>Email ID :</td>
            <td><sd:input path="Email" />
              
            <font color="red"><sd:errors path="EmployeeID" required="required"/> </font>
            <font color="red"><sd:errors path="Password" required="required" /></font> 
            <font color="red"><sd:errors path="Email" required="required"/> </font>
            
            </td></tr>
             
            <tr><td colspan="2" align="center"><input type="submit" value="Register"/></td></tr>   
       </table>
        </div>   
    </sd:form>     
</body>     
</html> 