<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE >
<html>
<head>
<style>
	body{font-family: Verdana;}
</style>
<title>Login</title>
</head>
<body>
<h3>Servidor de Nadie Site</h3>
<form method="POST" action="j_security_check">
	<div>
		Username:<input type="text" name="j_username" id="j_username" value="servidordenadie"/>
	</div>
	<div>
		Password:<input type="password" name="j_password" id="j_password" value="000000"/>
		<input type="submit" name="btnLogin" value="login"  />
	</div>
</form>
</body>
</html>