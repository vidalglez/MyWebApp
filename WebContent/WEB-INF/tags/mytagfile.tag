<%@ tag language="java" pageEncoding="US-ASCII"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="msge" required="true" rtexprvalue="true" %>
<%@attribute name="max" required="true" rtexprvalue="true" %>
<%System.out.println("Valid JSP?"); %>
<c:forEach begin="1" end="${max}" step="1" varStatus="counter">
	${counter.index} - ${msge}<br />
</c:forEach>
<br />
<jsp:doBody />