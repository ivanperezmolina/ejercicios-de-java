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
        <%
          int aleatorio = (int) (Math.random() * 3);

          String[] cubiletes = {"cubilete_sin_bola.png", "cubilete_sin_bola.png", "cubilete_sin_bola.png"};

          cubiletes[aleatorio] = "cubilete_con_bola.png";
        %>

        <img src="img/<%=cubiletes[0]%>">
        <img src="img/<%=cubiletes[1]%>">
        <img src="img/<%=cubiletes[2]%>">

        <%
          
        %>

        <h1> <%=aleatorio==Integer.parseInt(request.getParameter("cubo"))? "Enhorabuena has acertado" : "Lo siento has fallado"%> </h1>









    </body>
</html>
