<%-- 
    Document   : respuesta
    Created on : 30-ene-2019, 20:43:49
    Author     : Iván Pérez Molina

Realiza un cuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el cuestionario a tus
compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
en las diferentes asignaturas del curso. Utiliza radio buttons en las preguntas
del cuestionario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CUESTIONARIO 1º DAM</title>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <h1 class="text-center">CUESTIONARIO 1ºDAM</h1>
        
                <%
          int contador = 0;        
                  
         
          
          if((request.getParameter("pregunta1")).equals("option1")){
          contador++;
          }
          
          if((request.getParameter("pregunta2")).equals("option3")){
          contador++;
          }
          
          if((request.getParameter("pregunta3")).equals("option2")){
          contador++;
          }
          
          if((request.getParameter("pregunta4")).equals("option4")){
          contador++;
          }
          
          if((request.getParameter("pregunta5")).equals("option3")){
          contador++;
          }
          
          if((request.getParameter("pregunta6")).equals("option1")){
          contador++;
          }
          
          if((request.getParameter("pregunta7")).equals("option1")){
          contador++;
          }
          
          if((request.getParameter("pregunta8")).equals("option2")){
          contador++;
          }
          
          if((request.getParameter("pregunta9")).equals("option1")){
          contador++;
          }
          
          if((request.getParameter("pregunta10")).equals("option4")){
          contador++;
          }
          


        %>
        
        <h4 class='text-center'>El resultado del test es <%=contador%>/10 preguntas correctas</h4>
    </body>
</html>
