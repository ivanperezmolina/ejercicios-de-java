<%-- 
    Document   : saluda
    Created on : 29-ene-2019, 12:15:56
    Author     : Iván Pérez Molina

    Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola”
    seguido del nombre introducido. El nombre se deberá recoger mediante un
    formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 03</title>
    </head>
    <body>
        <%
          request.setCharacterEncoding("UTF-8");
          String nombre = request.getParameter("nombre");
          if((nombre==null)||(nombre.equals(""))){
          nombre="usuario";
          }
        %>
        

        <h1>Hello <%= nombre %>!</h1>
    </body>
</html>
