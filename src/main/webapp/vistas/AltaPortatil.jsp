<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

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
            
            <div style="text-align: center; font-size: 1cm;">Alta de un Portatil</div>
            
            <br /><br />
            
            <div>
                <div style="text-align: center;">Marca</div>
            </div>
            <div>
                <input name="marca" placeholder="AOC" required>
            </div>
            
            <br /><br />
            
            <div>
                <div style="text-align: center;">Modelo</div>
            </div>
            <div>
                <input name="modelo" placeholder="XPS 15" required>
            </div>
            
			<br /><br />
            
            
            <div>
                <div>      
                    <button type="submit" style="width: 100%">Registrar</button>                    
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
