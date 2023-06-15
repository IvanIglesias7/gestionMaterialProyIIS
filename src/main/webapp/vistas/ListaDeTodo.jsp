<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
            
	<div class="form-group row">
    	<div class="col-sm-4 col-form-label"></div>
    	<div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Eliminar Alumno</div>
    </div>
       
    <br><br><br><br>
    <div >
    <table class="table table-striped">
  		<thead>
    		<tr>
      			<th scope="col"></th>
      			<th scope="col">ID Alumno</th>
      			<th scope="col">Nombre</th>
      			<th scope="col">Teléfono</th>
      			<th scope="col">ID Portatil</th>
      			<th scope="col">Marca</th>
      			<th scope="col">Modelo</th>
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