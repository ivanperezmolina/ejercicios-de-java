<%-- 
    Document   : poker
    Created on : 04-feb-2019, 22:05:08
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
            <body>
        <% 
          out.print("<img width='200' src=\"img/dado"+(int)(Math.random()*6+1)+".png\">");
        %>
        
        <img width="200" src="img/dado<%= (int)(Math.random()*6+1)%>.png">
        <img width="200" src="img/dado<%= (int)(Math.random()*6+1)%>.png">
    </body>
    </body>
</html>
