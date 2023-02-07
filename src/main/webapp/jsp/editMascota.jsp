<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Mascotas</title>
	</head>
	<body>
		<br/><br/>
		<h3>Editar mascota</h3> <br/><br/>
		
		<div> ${mascotaParaEditar.numChip}  </div> <br/>
		<div> ${mascotaParaEditar.nombre}  </div>
		
		<!--  FORM  -->
		
		<br/><br/>
		<a href="/">Volver a inicio</a>
		
	</body>
</html>