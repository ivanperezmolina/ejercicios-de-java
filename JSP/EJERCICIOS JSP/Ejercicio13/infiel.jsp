<%-- 
    Document   : infiel
    Created on : 04-feb-2019, 19:29:37
    Author     : Iván Pérez Molina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <h1 class="text-center">Test de Infidelidad</h1>

        <%
          int contador = 0;

          if ((request.getParameter("pregunta1")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta2")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta3")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta4")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta5")).equals("option2")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta6")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta7")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta8")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta9")).equals("option1")) {
            contador = contador + 3;
          }

          if ((request.getParameter("pregunta10")).equals("option1")) {
            contador = contador + 3;
          }
        %>

        <h4 class='text-center'>Tienes <%=contador%> puntos</h4>
        <br><br>

        <%
          if ((contador <= 30) && (contador >= 22)) {
            out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
            %>
            <br><br>
            <img class="text-center" src="img/infiel.jpg" width="700" >
            
            
            <%
          } else {
            if ((contador < 22) && (contador > 11)) {
              out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");

%>
<br><br>
<img class="text-center" src="img/semiinfiel.png" width="700" >
<%
            } else {
              out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");

%>
<br><br>
<img class="text-center" src="img/fidelidad.jpg" width="700" >
<%
            }
          }
          


        %>

    </body>
</html>
