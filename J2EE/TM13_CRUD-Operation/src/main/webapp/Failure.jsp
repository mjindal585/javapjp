<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
<style>
.center {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid green; 
}
</style>
</head>
<body>
<div class="center">
<form action="index.jsp">
<table><tr><th colspan="10"><h3 align="center">Error occured while adding the Employee "<%= request.getAttribute("name") %>" records.</h3></th></tr>
<tr><td align="center"><input type="Submit" value="Home"></td></tr></table>
</form>
</div>
</body>
</html>