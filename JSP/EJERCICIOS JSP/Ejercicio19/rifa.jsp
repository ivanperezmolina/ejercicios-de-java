<%-- 
    Document   : rifa
    Created on : 04-feb-2019, 22:18:45
    Author     : Iván Pérez Molina

Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una
cantidad de dinero. A continuación aparecerá por pantalla una imagen de
forma aleatoria. Si sale una calavera, el usuario pierde todo su dinero y termina
el juego. Si sale medio limón, el usuario pierde la mitad del dinero y puede
seguir jugando con esa cantidad o puede dejar de jugar. Si sale el gato chino
de la suerte, el usuario multiplica por dos su dinero y puede seguir jugando
con esa cantidad o puede dejar de jugar.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

        <title>APUESTA Y GANA</title>
    </head>
    <body>
        <h1 class="text-center">APUESTA Y GANA</h1>

        <%
          int numeroAzar = (int) (Math.random() * 3) + 1;
          int dinero = Integer.parseInt(request.getParameter("dinero"));

          switch (numeroAzar) {
            case 1:%>
        <h4 class="text-center">PIERDES TODO TU DINERO</h4>
        <h3 class="text-center">SALDO= 0€</h3>

        <br>
        <div class="text-center"><img src="img/calavera.jpg" width="200"></div><br>
        <button type="submit" onclick="location.href = 'http://localhost:8080/EjerciciosJSP/Ejercicio19/index.html'" class="btn btn-primary btn-lg btn-block">APOSTAR OTRA VEZ</button>

        <%break;
          case 2:
            dinero = dinero / 2;
        %>
        <h4 class="text-center">SALDO REDUCIDO A LA MITAD</h4>
        <h3 class="text-center">SALDO= <%=dinero%></h3>

        <br>
        <div class="text-center"><img src="img/limon.jpg" width="200"></div><br>
        <button type="submit" onclick="location.href = 'http://localhost:8080/EjerciciosJSP/Ejercicio19/index.html'" class="btn btn-primary btn-lg btn-block">JUGAR OTRA VEZ</button>
        <button type="submit" onclick="location.href = 'http://localhost:8080/EjerciciosJSP/Ejercicio19/index.html'" class="btn btn-primary btn-lg btn-block">FIN DEL JUEGO</button>

        <%
          break;
          case 3:
            dinero = dinero * 2;%>
        <h4 class="text-center">SALDO MULTIPLICADO POR DOS</h4>
        <h3 class="text-center">SALDO= <%=dinero%></h3>

        <br>
        <div class="text-center"><img src="img/GATO.gif" width="200"></div><br>
        <button type="submit" onclick="location.href = 'http://localhost:8080/EjerciciosJSP/Ejercicio19/index.html'" class="btn btn-primary btn-lg btn-block">JUGAR OTRA VEZ</button>
        <button type="submit" onclick="location.href = 'http://localhost:8080/EjerciciosJSP/Ejercicio19/index.html'" class="btn btn-primary btn-lg btn-block">FIN DEL JUEGO</button>

        <%break;
          }
        %>
    </body>
</html>
