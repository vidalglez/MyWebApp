<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Testing YUI</title>
<script src="http://yui.yahooapis.com/3.18.1/build/yui/yui-min.js"></script>

</head>
<body>
	<div id="principal"></div>
	<p>Parrafo</p>
</body>
<script type="text/javascript">
	YUI().use('node', function(Y){
		Y.one("#principal").setHTML("Nuevo contenido");
	});
	
	YUI().use('node', function(Y){
		var parr = Y.one("p");
		parr.setHTML("Nuevo contenido.<br />");
		parr.prepend("Principio de contenido<br />");
		parr.append("Final de parrafo.");
	});
</script>
</html>
