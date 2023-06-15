<%@page import="gestionMaterialProyIIS.dto.AlumnoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/vistas/cabecera.jsp" %>      
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta alumno asignado a un portátil</title>
</head>
<body>

<%@ include file="/vistas/menu.jsp" %>

<form method="post" action="AlumnoPorPortatil">
  
	<br /><br />
            
	<div class="form-group row">
		<div ></div>
        <div class="col-form-label" style="text-align: center; font-size: 1cm;">Consulta alumno asignado a un portátil</div>
	</div>
           
    <br /><br /><br /><br />
            
    <div class="form-group row">
        <div class="col-sm-4 col-form-label"></div>
        <div class="col-sm-4 col-form-label" style="font-size: 0.5cm;">ID Portátil</div>
    </div>
    <div class="form-group row">
        <div class="col-sm-4 col-form-label"></div>
        <div class="col-sm-4">
        	<input class="form-control" type="number" min="1" max="10000" name="idPortatil" placeholder="7" required>
    	</div>
    </div>

    <br />
	<div class="form-group row">
   		<label class="col-sm-4 col-form-label"></label>
        <div class="col-sm-4">      
            <button type="submit" class="button btn btn-primary" style="width: 100%">Consultar</button>                    
        </div>
	</div>
	
	<br /><br />
    <% String mensaje = (String)request.getAttribute("mensaje"); %> 
            
    <div class="form-group row">
    	<label class="col-sm-4 col-form-label"></label>
    	<% if (mensaje != null) { %>
    		<div class="col-sm-4">
        		<div class="alert alert-success" style="text-align: center;">${mensaje}</div>                     
    		</div>
		<% } %>      
    </div>
                               
</form>

    <%AlumnoDTO alumno = (AlumnoDTO)request.getAttribute("alumnoDTO"); %>         	


	<% if (alumno != null) { %>
    		
    	<div class="form-group row">	
    		<label class="col-sm-4 col-form-label"></label>	
    		<div class="card text-white bg-info mb-3 col-sm-5" style="max-width: 24rem;">
  				<div class="card-header">Alumno asignado</div>
  				<div class="card-body">
  				<h5 class="card-title">ID -> ${alumnoDTO.id_alumno}</h5>
    			<p class="card-card-title">
    				Nombre -> ${alumnoDTO.nombre}
    				<br>
    				Teléfono -> ${alumnoDTO.tlf} 
    			</p>
  				</div>
			</div>
		</div>
    		
	<% } %> 

</body>
</html>