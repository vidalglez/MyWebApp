<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	//String colors = new String("red,blue,green,yellow");
	String colors = "red,blue,green,yellow";
	pageContext.setAttribute("colors", colors);
%>
<jsp:getProperty name="myBean" property="msge" />
<br />
<table style="border: 1px solid black;">
<c:forEach items="${colors}" varStatus="status" var="colors">
	<tr>
		<td>${status.index}</td>
		<td>${status.current}</td>
	</tr>
</c:forEach>
</table>
<%
	Double result = new Double(5.0);
	pageContext.setAttribute("result", result);
%>

<c:if test="${result == 5 }" var="result" scope="page">
	The result is ${result}
</c:if>

<jsp:useBean id="anotherBean" class="com.example.beans.MyBean"  />
<%--
<jsp:useBean id="aBean" type="com.example.beans.MyBean"  beanName="aBean"/>
--%>