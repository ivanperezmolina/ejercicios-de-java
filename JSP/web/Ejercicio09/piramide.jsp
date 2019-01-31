<%-- 
    Document   : piramide
    Created on : 30-ene-2019, 18:44:19
    Author     : Iván Pérez Molina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 09</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <h1 class="text-center">CONSTRUCTOR DE PIRÁMIDES</h1>
        
        <%
          int altura = Integer.parseInt(request.getParameter("altura"));
         int planta = 1;
         int longitudDeLinea = 1;
         int espacios = altura-1;
    
    while (planta <= altura) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        
        %>
        <p></p>
<%
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        %>
        <img src="img/pelota.png" width="50" >
        <%
      }
%>
<br>
<%

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  

        %>
        
        
        
        
        
    </body>
</html>
