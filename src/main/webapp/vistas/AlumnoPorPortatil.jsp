<%@page import="gestionMaterialProyIIS.dto.AlumnoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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
            
	<div>
		<div style="text-align: center; font-size: 1cm;">Consulta alumno asignado a un portátil</div>
	</div>
           
    <br /><br /><br /><br />
            
    <div>
        <div style="font-size: 0.5cm;">ID Portátil</div>
    </div>
    <div>
        <input type="number" min="1" max="10000" name="idPortatil" placeholder="7" required>
    </div>

    <br />
	<div>   
        <button type="submit" style="width: 100%">Consultar</button>                    
	</div>
	
	<br /><br />
    <% String mensaje = (String)request.getAttribute("mensaje"); %> 
            
    <div>
    	<% if (mensaje != null) { %>
    		<div style="text-align: center;">${mensaje}</div>                     
    	<% } %>      
    </div>
                               
</form>

<% AlumnoDTO alumno = (AlumnoDTO)request.getAttribute("alumnoDTO"); %>         	

<% if (alumno != null) { %>
    		
    <div>	
    	<div style="max-width: 24rem;">
			<div>Alumno asignado</div>
			<div>
				<h5>ID -> ${alumnoDTO.id_alumno}</h5>
				<p>
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
