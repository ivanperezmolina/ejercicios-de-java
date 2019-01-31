<%-- 
    Document   : tablas
    Created on : 30-ene-2019, 18:26:13
    Author     : Iván Pérez Molina

    Realiza una aplicación que pida un número y que luego muestre la tabla de
    multiplicar de ese número. El resultado se debe mostrar en una tabla (<table>
    en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 08</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
<h1 class="text-center">Tablas de multiplicar</h1>

        <table class="table table-light">
            <thead>
                <tr>
                    <th scope="col">Producto</th>
                    <th scope="col">Multiplicacion</th>
                </tr>
            </thead>
        </table>
        <%
          int numeroAMultiplicar = Integer.parseInt(request.getParameter("numero"));
          int resultado = 0;

          for (int i = 0; i < 11; i++) {
            resultado = numeroAMultiplicar * i;
          

        %>
        
        <table class="table table-light">
            <tbody>
                <tr>
                    <th scope="row"><%=numeroAMultiplicar%>x<%=i%></th>
                    <td><%=resultado%></td>
                </tr>

            </tbody>
        </table>



<%}%>










    </body>
</html>
