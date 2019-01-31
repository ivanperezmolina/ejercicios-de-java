<%-- 
    Document   : conversor
    Created on : 30-ene-2019, 11:04:38
    Author     : Iván Pérez Molina
    
    Combina las dos aplicaciones anteriores en una sola de tal forma que en la
    página principal se pueda elegir pasar de euros a pesetas o de pesetas a euros.
    Adorna la página con alguna foto o dibujo.
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de monedas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <%
          if (request.getParameter("tipo").equals("option1")) {
            double cantidadPesetas = Double.parseDouble(request.getParameter("cantidad"));

            double transformacion = ((cantidadPesetas) / (166.386));
            DecimalFormat dosDecimales = new DecimalFormat("0.00");
        %>
        <h1 class="text-center"> Conversor de Pesetas a Euros </h1>
        <br>
        <h2 class="text-center"><%=dosDecimales.format(cantidadPesetas)%> pesetas son <%=dosDecimales.format(transformacion)%> €</h2>
        
        <%}else{
          double cantidadEuros = Double.parseDouble(request.getParameter("cantidad"));

          double transformacion = ((cantidadEuros) * (166.386));
          DecimalFormat dosDecimales = new DecimalFormat("0.00");
        %>
           <h1 class="text-center"> Conversor de Euros a Pesetas </h1>
        <br>
        <h2 class="text-center"><%=dosDecimales.format(cantidadEuros)%> € son <%=dosDecimales.format(transformacion)%> pesetas</h2>
        <%}%>
        
    </body>
</html>
