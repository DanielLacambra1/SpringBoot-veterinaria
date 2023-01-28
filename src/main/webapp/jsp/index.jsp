<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<input type="radio" id="vacunacion" name="vacunacion" value="true">S� </input> 
			<input type="radio" id="vacunacion" name="vacunacion" value="false">No </input> 
			
			<input type="submit"/>
		</form:form>
		
		<br/><br/><br/>
		
		<h3>Insertar due�o</h3>
		<form:form action="addDue�oForm" method="post" modelAttribute="due�o">
			<span>Nombre:</span>
			<form:input path="nombre" type="text" name="nombre"/>
			
			<span>DNI:</span>
			<form:input path="dni" type="text" name="dni"/>
			
			<input type="submit"/>
		</form:form>
		
	</body>
</html>