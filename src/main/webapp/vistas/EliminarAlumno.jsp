<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/vistas/cabecera.jsp" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Baja de Alumnos</title>
</head>


<body>
<%@ include file="/vistas/menu.jsp" %>

<form method="post" action="bajaAlumno" id="myForm">
<div style="margin: 0 20px;">
	<br /><br />
            
	<div class="form-group row">
    	<div class="col-sm-4 col-form-label"></div>
    	<div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Baja Alumno</div>
    </div>
       
    <br><br><br><br>
    <div >
    <table class="table table-striped">
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
    					<button type="submit" class="btn btn-danger" id="myboton" name="id" value="${alumno.id_alumno}" onclick="if(confirm('¿Estas seguro de que deseas eliminar este usuario?')) { document.getElementById('myForm').submit(); } else { return false; }">Eliminar</button>
					</td>
    			</tr>
    		</c:forEach>
  		</tbody>	
	</table>
    </div>       

    <% String mensaje = (String)request.getAttribute("mensaje"); %> 
            
    <div class="form-group row">
        <label class="col-sm-4 col-form-label"></label>
        <% if (mensaje != null) { %>
    		<div class="col-sm-4">
        		<div class="alert alert-success" style="text-align: center;">${mensaje}</div>                     
    		</div>
		<% } %>      
    </div>       
           
                   
</div>



</form>



</body>
</html>








