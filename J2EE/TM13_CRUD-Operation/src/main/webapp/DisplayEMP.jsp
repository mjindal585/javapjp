<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="com.wipro.bean.Employee"%>

<% ArrayList<Employee> lst = (ArrayList) request.getAttribute("listUser"); %>
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
              
         <% for(int rec=0;rec<lst.size();rec++){ %>
            <tr>
                 <% Employee emp=(Employee)lst.get(rec); %>   
                
                    <td><%= emp.getId() %></td>
                    <td ><%= emp.getName() %></td>
                    <td ><%= emp.getGender() %></td>
                    <td ><%= emp.getDesignation() %></td>
                    <td ><%= emp.getEmail() %></td>
                    <td ><%= emp.getCity() %></td>
                    <td ><%= emp.getSalary() %></td>
                    <td ><%= emp.getPhone() %></td>
                 </tr>
                 <% } %>
                  <tr>  <td colspan="8" align="center">
                     <a href="NewEMPDetails.html">Modify</a>
                     <a href="DELETEEMP.html">Delete</a>                     
                    </td>
                </tr>
       
        </table>
    </div> 
</body>
</html>