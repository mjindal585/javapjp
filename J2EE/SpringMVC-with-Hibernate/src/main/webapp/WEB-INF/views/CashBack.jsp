<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="sd" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
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
<title>CashBack</title>
</head>
<body>
<div>
<sd:form action="/SpringMVCwithHibernate">
<h2>Congratulations ${cid}</h2>
<h4>You have earned the cash back offer.</h4>
Your new Account Balance is: ${NewBalance}<br>
Coupon Code Applied was: ${cc}<br>
<input type="submit" value="Home" />
</sd:form>
</div>
</body>
</html>