<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<meta charset="ISO-8859-1">
		<title>Duenos</title>
	</head>
	<body>
		<br/><br/>
		<h3>Listado de duenos</h3> <br/><br/>

		<table class="table table-striped">		
			<tr style="border:1px solid black; padding:5pt">
				<th scope="col">Nombre</th>
				<th scope="col">DNI</th>
				<th scope="col">Nombre mascota</th>
				<th scope="col">Editar</th>
				<th scope="col">Eliminar</th>
			</tr>
			<c:forEach var="dueno" items="${listaDuenos}">
				<tr style="border:1px solid black; padding:5pt">
					<td> <c:out value="${dueno.nombre}" /> </td>
					<td> <c:out value="${dueno.dni}" /> </td>
					<td> <c:out value="${dueno.mascota.nombre}" /> </td>
					<td> <a href="/editDueno?dni=${dueno.dni}"><input type="button" value="Editar"></a> </td> 
					<td> <a href="/deleteDueno?dni=${dueno.dni}"><input type="button" value="Eliminar"></a> </td> 
				</tr>
			</c:forEach>
		</table>

	</body>
</html>