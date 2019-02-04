<%-- 
    Document   : fibonacci
    Created on : 04-feb-2019, 21:27:16
    Author     : Iván Pérez Molina

Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
debe introducir por teclado.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
        <title>Ejercicio15</title>
    </head>
    <body>
        <h1 class="text-center">Serie de Fibonacci</h1><br>
        <h5>Se muestra a continuación, la serie de Fibonacci:</h5>

        <%

          long f1 = 0;
          long f2 = 1;
          long aux;
          int n = Integer.parseInt(request.getParameter("serie"));
          switch (n) {
            case 1:
              out.print("0");
              break;
            case 2:

              out.print("0 1");
              break;
            default:
              out.print("0 1");
              while (n > 2) {
                aux = f1;
                f1 = f2;
                f2 = aux + f2;
                out.print(" " + f2);
                n--;
              }
          }


        %>
    </body>
</html>
