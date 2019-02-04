<%-- 
    Document   : pesetasAEuros
    Created on : 30-ene-2019, 10:37:00
    Author     : Iván Pérez Molina
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 06</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <%
          double cantidadPesetas = Double.parseDouble(request.getParameter("pesetas"));

          double transformacion = ((cantidadPesetas) / (166.386));
          DecimalFormat dosDecimales = new DecimalFormat("0.00");


        %>
        <h1 class="text-center"> Conversor de Pesetas a Euros </h1>
        <br>
        <h2 class="text-center"><%=dosDecimales.format(cantidadPesetas)%> pesetas son <%=dosDecimales.format(transformacion)%> €</h2>
    </body>
</html>
