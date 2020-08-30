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
<title>Enter Coupon Code</title>
</head>
<body>
<div>
<sd:form action="EnterCoupon/${cid}/${pswd}/${Balance}" modelAttribute="cst">
Hello Customer: ${cid}
<h3>Your Current Balance is: ${Balance}</h3>
<h4>Claim your Cash Back Here</h4>
Enter your Coupon Code:<sd:input path="CouponCode"/>
<input type="Submit" value="Claim"/>
</sd:form>
</div>
</body>
</html>