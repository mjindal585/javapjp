<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="com.wipro.bean.Employee"%>
           <%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page import="java.util.Iterator"%> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Display Employee</title>
<style>
div{
border:1pt solid green;
position:absolute;
trsanform:translate(-50%,-50%);
}
</style>
</head>
<body>
<h3 align="center">Employee Details:</h3>
    <div align="center" class="table-responsive">
    <sp:form action="NewEmpDetails" modelAttribute="ed">
        <table class="table">
           <tr><th colspan="8" align="center"><h3>List of Employees</h3></th></tr>
            <tr>
                <th >ID</th>
                <th >Name</th>
                <th >Gender</th>
                <th >Designation</th>
                <th >Email</th>
                <th >City</th>
                <th >Salary</th>
                <th >Phone</th>
               </tr> 
         
	<c:forEach var="empDetails" items="${p}">
	 <tr>  
            <td>${empDetails.getId()}</td>
            <td>${empDetails.getName()}</td>
            <td>${empDetails.getGender()}</td>
            <td>${empDetails.getDesignation()}</td>
            <td>${empDetails.getEmail()}</td>
            <td>${empDetails.getCity()}</td>
            <td>${empDetails.getSalary()}</td>
            <td>${empDetails.getPhone()}</td>
            </tr>
            </c:forEach>
           
                  <tr>  <td colspan="8" align="center">
                     <input type="submit" value="Modify"/>                   
                    </td>
                </tr>
       
        </table>
        </sp:form>
    </div> 
</body>
</html>