<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Session testing example</title>
</head>
<%-- 
<%
	x = 10;
%>

<% int x = 5; %>
<%! int x; %>
x =<%= x %>
x = <%=page.x%>
--%>
<body>
	<h3>Bean testing example</h3>

<jsp:useBean id="myBean" class="com.example.beans.MyBean" />
<jsp:setProperty name="myBean" property="msge" value="this is a message set in myBean"/>
<%@include file="another.jsp" %>

<%--
<jsp:include page="another.jsp" />
--%>
<h3>myBean example</h3>
${myBean.msge}<br />
${myBean["msge"]}<br />
<%--<div>not existent property for myBean ${myBean.name}</div>--%>
<h3>Hibernate example</h3>
<jsp:useBean id="user" scope="request" class="com.example.dto.Users"/>
<div>
	ID: <jsp:getProperty name="user" property="id" /> Name: <jsp:getProperty name="user" property="username" />
</div>
</body>
</html>