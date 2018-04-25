<%@ tag language="java" pageEncoding="US-ASCII"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@attribute name="counter" %>
<c:forEach begin="1" end="3" varStatus="loopCounter">
	<jsp:doBody />
	Tag File: ${counter + loopCounter.index}
</c:forEach>