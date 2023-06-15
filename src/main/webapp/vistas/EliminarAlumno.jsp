<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/vistas/cabecera.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baja de Alumnos</title>
</head>

<body>
<%@ include file="/vistas/menu.jsp" %>

<form method="post" action="eliminarAlumno" id="myForm">
<div style="margin: 0 20px;">
	<br /><br />
            
	<div style="text-align: center; font-size: 1cm;">Baja Alumno</div>
       
    <br><br><br><br>
    <div>
    <table>
  		<thead>
    		<tr>
      			<th scope="col"></th>
      			<th scope="col">ID</th>
      			<th scope="col">Nombre</th>
      			<th scope="col">Teléfono</th>
      			<th scope="col">Eliminar</th>
    		</tr>
  		</thead>
  		<tbody>
  			<c:forEach var="alumno" items="${listAlumnos}">
    			<tr>
      				<td>${alumno.id_alumno}</td>
      				<td>${alumno.nombre}</td>
    				<td>${alumno.tlf}</td>
    				<td>
    					<button type="submit" id="myboton" name="id" value="${alumno.id_alumno}">Eliminar</button>
					</td>
    			</tr>
    		</c:forEach>
  		</tbody>	
	</table>
    </div>       

    <% String mensaje = (String)request.getAttribute("mensaje"); %> 
            
    <div>
        <% if (mensaje != null) { %>
    		<div style="text-align: center;">${mensaje}</div>                     
    	<% } %>      
    </div>       
           
                   
</div>
</form>

</body>
</html>
