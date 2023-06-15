<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/vistas/cabecera.jsp" %>       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todos los alumnos con su asignación de portátil</title>
</head>
<body>

<%@ include file="/vistas/menu.jsp" %>

<div style="margin: 0 20px;">
	<br /><br />
            
	<div>
    	<div style="text-align: center; font-size: 1cm;">Eliminar Alumno</div>
    </div>
       
    <br><br><br><br>
    <div >
    	<table>
  			<thead>
    			<tr>
      				<th></th>
      				<th>ID Alumno</th>
      				<th>Nombre</th>
      				<th>Teléfono</th>
      				<th>ID Portátil</th>
      				<th>Marca</th>
      				<th>Modelo</th>
    			</tr>
  			</thead>
  			<tbody> 			
  				<c:forEach var="alumno" items="${miModel.listaAlumnos}">
  					<tr>
    					<td>${alumno.id_alumno}</td>
    					<td>${alumno.nombre}</td>
    					<td>${alumno.tlf}</td>
    					<c:forEach var="portatil" items="${miModel.listaPortatiles}" varStatus="innerLoop">
      						<c:if test="${innerLoop.index == loop.index}">
        						<td>${portatil.id_portatil}</td>
        						<td>${portatil.marca}</td>
        						<td>${portatil.modelo}</td>
      						</c:if>
    					</c:forEach>
  					</tr>
				</c:forEach>		
  			</tbody>	
		</table>
    </div>       
                 
</div>

</body>
</html>
