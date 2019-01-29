<%-- 
    Document   : resultadoCubilete
    Created on : 29-ene-2019, 19:44:07
    Author     : Iván Pérez Molina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego del Trile</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <h1>RESULTADO</h1>
        <img src="img/0.png" style="padding: 20px">
        <img src="img/1.png" style="padding: 20px">
        <img src="img/0.png" style="padding: 20px">


        <!--Si selecciona 1º opcion-->

        <%
          if (request.getParameter("cubilete").equals("option1")) {
        %>
        <div class="alert alert-danger" role="alert">
            “Lo siento, no has acertado”
        </div>

        <% }
        %>

        <!--Si selecciona 2º opcion-->

        <%
          if (request.getParameter("cubilete").equals("option2")) {
        %>
        <div class="alert alert-success" role="alert">
            “¡Enhorabuena!, has encontrado la bolita”
        </div>

        <% }
        %>

        <!--Si selecciona 3º opcion-->

        <%
          if (request.getParameter("cubilete").equals("option3")) {
        %>
        <div class="alert alert-danger" role="alert">
            “Lo siento, no has acertado”
        </div>

        <% }
        %>

    </body>
</html>
