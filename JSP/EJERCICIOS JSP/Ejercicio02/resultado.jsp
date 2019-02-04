<%-- 
    Document   : resultado
    Created on : 30-ene-2019, 9:55:33
    Author     : Iván Pérez Molina

    Mejora el programa anterior de tal forma que la apariencia de la página
    web que muestra el navegador luzca más bonita mediante la utilización de
    CSS (utiliza siempre ficheros independientes para CSS para no mezclarlo con
    HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 02</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="text-center">Hello World!</h1>

        <div class="alert alert-primary" role="alert">
            <h5><b>Nombre:</b></h5><p> Iván Pérez Molina</p>
        </div>

        <div class="alert alert-success" role="alert">
            <h5><b>Edad:</b></h5><p> 18 años</p>
        </div>

        <div class="alert alert-warning" role="alert">
            <h5><b>Domicilio:</b></h5><p> Calle Nueva nº28 (Llanos de Don Juan)</p>
        </div>
        <div class="alert alert-info" role="alert">
            <h5><b>Telefono:</b></h5><p> 609 66 33 23</p>
        </div>

        
        
    </body>
</html>
