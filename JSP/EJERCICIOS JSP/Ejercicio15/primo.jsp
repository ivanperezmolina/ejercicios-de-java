<%-- 
    Document   : primo
    Created on : 04-feb-2019, 21:39:25
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

          for (int j = 0; j < 100; j++) {
            int numero = 0;
            int contador = 0;
            numero = (int) (Math.random() * 100);

            for (int i = 1; i <= numero; i++) {

              if ((numero % i) == 0) {

                contador++;

              }

            }

            if (contador <= 2) {
        %>
        <p style="display:inline; color: red"><%=numero%>  </p>

        <%

        } else {
        %>
        <p style="display:inline; color: blue"><%=numero%>  </p>
        <%

            }

          }


        %>
    </body>
</html>
