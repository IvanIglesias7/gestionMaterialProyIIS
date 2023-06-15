<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/vistas/cabecera.jsp" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta de un Portatil</title>
</head>

<body>

<%@ include file="/vistas/menu.jsp" %>

<form method="post" action="altaPortatil">
        <div>  
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label" style="text-align: center; font-size: 1cm;">Alta de un Portatil</div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Marca</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="marca" placeholder="Dell" required>
                </div>
            </div>
            
            <br /><br />
            
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4 col-form-label">Modelo</div>
            </div>
            <div class="form-group row">
                <div class="col-sm-4 col-form-label"></div>
                <div class="col-sm-4">
                    <input class="form-control" name="modelo" placeholder="XPS 15" required>
                </div>
            </div>
            
			<br /><br />
            
            
            <div class="form-group row">
                <label class="col-sm-4 col-form-label"></label>
                <div class="col-sm-4">      
                    <button type="submit" class="button btn btn-primary" style="width: 100%">Registrar</button>                    
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