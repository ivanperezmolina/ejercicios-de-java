<%-- 
    Document   : cocheListo
    Created on : 29-ene-2019, 13:58:40
    Author     : Iván Pérez Molina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Su Porsche Listo</title>
    </head>
    <body>
        <h1>Aquí tiene su coche ¡Que lo disfrute!</h1>
        <img src="img/<%= request.getParameter("color")%><%=request.getParameter("llantas")%>.jpg">
        
    </body>
</html>
