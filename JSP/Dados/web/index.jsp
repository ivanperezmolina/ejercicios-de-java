<%-- 
    Document   : index
    Created on : 24-ene-2019, 10:04:55
    Author     : Iván Pérez Molina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
          out.print("<img width='400' src=\"img/dado"+(int)(Math.random()*6+1)+".png\">");
        %>
        
        <img width="400" src="img/dado<%= (int)(Math.random()*6+1)%>.png">
    </body>
</html>
