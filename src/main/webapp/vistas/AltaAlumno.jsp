<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/vistas/cabecera.jsp" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Matricula Alumno</title>

</head>

<body>
<%@ include file="/vistas/menu.jsp" %>

<form method="post" action="AltaAlumno">
        <div>          
            <br /><br />
            
            <div style="text-align: center; font-size: 1cm;">Matrícula Alumno</div>
            
            <br /><br />
            
            <div>
                <div style="text-align: center;">Nombre</div>
            </div>
            <div>
                <input name="nombre" placeholder="Pepito Lopez" required>
            </div>
            
            <br /><br />
            
            <div>
                <div style="text-align: center;">Teléfono</div>
            </div>
            <div>
                <input name="tlf" placeholder="+34 632121212" required>
            </div>
            
            <br /><br />
            
            <div>
                <div style="text-align: center;">Portatil (Seleccione un ID)</div>
            </div>
            <div>
                <select name="idPortail" id="mySelect">
                    	<c:forEach var="id" items="${listIDsPortailesLibres}">
                    		<option>${id}</option>
                    	</c:forEach>                   	
                </select>
            </div>
            
			<br /><br />
			
			
            <div>
                <div>
    				<button type="submit" id="myDiv" style="width: 100%">Registrar</button>                     
                </div>
            </div>  
            
            <br />
            
        
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
