<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="US-ASCII">
<title>Employees Module</title>
<style>
	body{
		font-family: Verdana;
	}
</style>
</head>
<body>
	<h2>Employees Module</h2>
	<table style="border: 1px solid black;">
		<th>
			<td>Id</td><td>Name</td>
		</th>
	<c:forEach items="${employeesList}" var="employee">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.firstName} ${employee.lastName}</td>
		</tr>
	</c:forEach>
	</table>
	<a href="employeeForm.jsp">Add Employee</a>
</body>
</html>