<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sd" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<sd:form action="InsertStudent" modelAttribute="std">
Student Id:<sd:input path="StudentId"/>
Student Name:<sd:input path="StudentName"/>
Address:<sd:input path="Address"/>
<input type="submit"/> 
</sd:form>
</pre>
</body>
</html>