<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="US-ASCII">
<title>Employee Result</title>
<style>
	body{
		font-family: Verdana;
	}
</style>
</head>
<body>
	<h2>Employee Result</h2>
	<jsp:useBean id="EmployeeForm" class="com.example.forms.EmployeeForm"  scope="request"/>
	<div>
		Employee ${EmployeeForm.firstName} ${EmployeeForm.lastName} was registered successfully.
	</div>
	<div>Username: ${user.username}</div>
	<a href="jsp/employees.jsp">Go to Employee module</a>
</body>
</html>