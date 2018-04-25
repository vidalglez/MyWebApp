<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="my" uri="servidordenadie.net" %>    
<%@taglib prefix="tf" tagdir="/WEB-INF/tags/" %>
<!DOCTYPE>
<html>
<head>

<title>Testing Custom Tags</title>
<style>
	body{font-family: Verdana; font-size: 12px;}
</style>
</head>
<body>
	<h3>My First web site in MAC OSX</h3>
	<c:set var="testVar" >A value declared for JSTL c:set</c:set>
	<c:out value="${testVar}" /><br />
	<h3>Testing SimpleTag Handler</h3>
	<my:simpTag msge="You know you're right!">Testing body content</my:simpTag><br />
	<my:simpTag msge="Wonderful!" /><br />
	<tf:mytagfile max="5" msge="Master Cerati!" />
	<tf:mytagfile max="2" msge="Testing">Printing body</tf:mytagfile>
	<tf:quest12></tf:quest12>
	<br />
	<c:set var="counter" value="1" />
	<tf:quest14 counter="${counter}">
		Body ${counter}
	</tf:quest14>
	<br />
	<my:q19>
		<my:simpTag msge="Testing!" />
	</my:q19>
	<br />
	<my:simpTag msge="Second Testing">
		<my:q19></my:q19>
	</my:simpTag>
	<br />
	<a href="html/ex1.html">jQuery Test 1</a>
	<c:url var="urlDS" value="myConn" />
	<a href="${urlDS}">Go to MyConn</a>
	<!--<a href="jsp/employees.jsp">Employee Module</a>-->
	<a href="listEmployees.do">Employee Module</a>
	
	<a href="html/lounge.html">Lounge</a>
	<a href="html/webvilletv.html">Webville TV</a>
	<c:set var="item">an Item X</c:set>
	<br />
	<%-- <my:testBody item="Setting an JspFragment attribute ${item}">--%>
	<my:testBody>
		<jsp:attribute name="msge"></jsp:attribute>
		<jsp:body>
			Setting an JspFragment attribute ${item}<br />
			Servidor de Nadie<br />
			${myScpAttr}<br/>
			<%-- <c:set var="item" value="${item} added"/>--%>
		</jsp:body>		
	</my:testBody>
	<br />
	Value from Item: ${item}<br />
	<a href="jsp/yuiTest.jsp">Go to YUI</a><br />
	<%-- <jsp:useBean id="mybean" class="com.example.beans.MyBean" scope="session" /><%= mybean.getMsge() %> --%>
	
	<jsp:useBean id="mybean" class="com.example.beans.MyBean" scope="session"></jsp:useBean><%= mybean.getMsge() %>
	<div><!--<a href="${pageContext.request.contextPath}/imgServ">Show image servlet</a>-->
		<img src="${pageContext.request.contextPath}/imgServ" style="width: 30%;" />
	</div>
</body>
</html>