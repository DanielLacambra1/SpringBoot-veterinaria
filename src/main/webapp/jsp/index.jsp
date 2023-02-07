<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>Insertar mascota</h3>
		<form:form action="addMascotaForm" method="post" modelAttribute="mascota">
			<span>NumChip:</span>
			<form:input path="numChip" type="number" name="numChip"/>
			
			<span>Nombre:</span>
			<form:input path="nombre" type="text" name="nombre"/>
			
			<label for="vacunacion">Vacuna:</label>
			<input type="radio" id="vacunacion" name="vacunacion" value="true">Si </input> 
			<input type="radio" id="vacunacion" name="vacunacion" value="false">No </input> 
			
			<input type="submit"/>
		</form:form>
		
		<br/><br/><br/>
		
		<h3>Insertar dueno</h3>
		<form:form action="addDuenoForm" method="post" modelAttribute="dueno">
			<span>Nombre:</span>
			<form:input path="nombre" type="text" name="nombre"/>
			
			<span>DNI:</span>
			<form:input path="dni" type="text" name="dni"/>
		
			<form:select path="mascotaDescompuesta"> 
				<form:options items="${listaMascotas}" itemLabel="nombre"/> 
			</form:select>

			<input type="submit"/>
		</form:form>
		
		
		<br/><br/><br/>
		<a href="listMascotas">Lista/Editar/Eliminar mascotas</a>	 <!-- ListMascotaController -->
		<br/><br/>
		<a href="listDuenos">Lista/Editar/Eliminar duenos</a>	<!-- ListDuenoController -->
		
	</body>
</html>


