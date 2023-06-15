<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/vistas/cabecera.jsp" %>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Matricula Alumno</title>

<script>
window.onload = function() {
    var mySelect = document.getElementById("mySelect");
    var myDiv = document.getElementById("myDiv");
    if (mySelect.value === "No hay portatiles libres") {
        myDiv.disabled = true;
    }
};
</script>

</head>

<body>
<%@ include file="/vistas/menu.jsp" %>

<form method="post" action="AltaAlumno">
        <div>          
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Matrícula Alumno</div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Nombre</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="nombre" placeholder="Pepito Lopez" required>
                </div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Teléfono</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="tlf" placeholder="+34 632121212" required>
                </div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Portatil (Seleccione un ID)</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <select class="form-control" name="idPortail" id="mySelect">
                    	<c:forEach var="id" items="${listIDsPortailesLibres}">
                    		<option>${id}</option>
                    	</c:forEach>                   	
                    </select>
                </div>
            </div>
            
			<br /><br />
			
			
            <div class="form-group row">
                <label class="col-sm-4 col-form-label"></label>
                <div class="col-sm-4">
    				<button type="submit" id="myDiv" class="button btn btn-primary" style="width: 100%">Registrar</button>                     
                </div>
            </div>  
            
            <br />
            
        
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













