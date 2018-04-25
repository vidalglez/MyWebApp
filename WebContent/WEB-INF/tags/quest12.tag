<%@ tag language="java" pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="character">65</c:set>
<c:forEach begin="1" end="10" varStatus="loopCount" >
<% 
char c = (char) Integer.parseInt(jspContext.getAttribute("character").toString());
jspContext.setAttribute("displayCharacter", new Character(c));
%>
${displayCharacter}
<c:set var="character">${character + 1}</c:set>
</c:forEach>