<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="html_" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="US-ASCII">
<title>Employee Form</title>
<style>
body {
	font-family: Verdana;
	font-size: small;
}

.errorEmployeeForm {
	color: red;
}

div label{
	color: blue;
	width: 50px;
}
</style>
</head>
<body>
	<h2>Employee Form</h2>
	<%--
	<form method="POST" id="employeeForm" action="${pageContext.request.contextPath}/addEmployee.do">
		<div><label for="id">ID:</label><input type="text" id="id" value="" ></div>
		<div><label for="firstName">First Name:</label><input type="text" id="firstName" value="" alt="Introduce"></div>
		<div><label for="lastName">Last Name:</label><input type="text" id="lastName" value=""></div>
		<div><input type="submit" id="btnSend" value="Send"></div>
		<div><a href="employees.jsp">Go to Employee module</a></div>
	</form>
	--%>
	<%--
	<html_:form açtion="${pageContext.request.contextPath}/addEmployee.do" method="POST">
		<div><label for="id">ID:</label><html_:text property="id" id="id" /></div>
	</html_:form>
	--%>
	<html_:form action="addEmployee" method="POST">
		<div>
			<label for="id">ID:</label>
			<html_:text property="id" value="1" styleId="id" />
			<span class="errorEmployeeForm"><html_:errors property="id" /></span>
		</div>
		<div>
			<label for="firstName">First Name:</label>
			<html_:text property="firstName" value="Gustavo" styleId="firstName" />
			<span class="errorEmployeeForm"><html_:errors property="firstName" /></span>
		</div>
		<div>
			<label for="lastName">Last Name:</label>
			<html_:text property="lastName" value="Cerati" styleId="lastName" />
			<span class="errorEmployeeForm"><html_:errors property="lastName" /></span>
		</div>
		<div>
			<html_:submit value="Send" />
		</div>
	</html_:form>
</body>
</html>