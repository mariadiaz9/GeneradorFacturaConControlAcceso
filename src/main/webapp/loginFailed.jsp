<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h6 style="color:rgb(255,0,0);">Inicio de sesion fallido, intentelo denuevo</h6>
	<form action="servicioLogin" method="POST">
		<label>nombre</label>
		<input type="text" name="nombre" /> <br>
		<label>password</label>
		<input type="text" name="password" /> <br>
		
		<input type="submit" value="LOGIN">
		
	</form>
</body>
</html>