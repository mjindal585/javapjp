<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Login page</title>   

</head>    
<body>    
    <h1 align="center"> User Login Form </h1> 
    ${msg}
    <sp:form action="AfterLogin" modelAttribute="ud">  
        <div > 
        <table>  
           <tr><td> User-name : </td>   
            <td><sp:input path="Username" /></td></tr>  
            <tr><td>Password :</td>
            <td><sp:input path="Password" /></td></tr> 
             
            <tr><td colspan="2" align="center"><input type="submit" value="Login"/></td></tr>   
       </table>
        </div>   
    </sp:form>     
</body>     
</html>