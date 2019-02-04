<%-- 
    Document   : calendar
    Created on : 04-feb-2019, 19:14:36
    Author     : Iván Pérez Molina

Mejora la aplicación anterior de tal forma que no haga falta introducir el día
de la semana en que cae el día 1 y el número de días que tiene el mes. El
programa debe deducir estos datos del mes y el año. Pista: puedes usar la
clase Calendar (java.util.Calendar).
--%>

<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio12</title>
    </head>
    <body>
        <%
          String nombreMes = request.getParameter("nombreMes");
          int numeroAño = Integer.parseInt(request.getParameter("numeroAño"));
          String texto = request.getParameter("texto");
          String nombreDia1 = request.getParameter("nombreDia1");
          int diasMes = Integer.parseInt(request.getParameter("diasMes"));
        %>


        <%
          Calendar calender = Calendar.getInstance();

          Calendar sameDate = new GregorianCalendar(numeroAño, Calendar.FEBRUARY, 22, 23, 11, 44);
          System.out.println("Some Date : " + sameDate.getTime());

          out.print("Año : " + calender.get(Calendar.YEAR));

          out.println("Mes (enero es el mes 0)  : " + calender.get(Calendar.MONTH));

          out.println("Día del mes  : " + calender.get(Calendar.DAY_OF_MONTH));

          out.println("Día de la semana (la semana empieza el domingo)  : " + calender.get(Calendar.DAY_OF_WEEK));

          out.println("Día del año  : " + calender.get(Calendar.DAY_OF_YEAR));

          out.println("Semana del año  : " + calender.get(Calendar.WEEK_OF_YEAR));

          out.println("Semana del mes  : " + calender.get(Calendar.WEEK_OF_MONTH));

          out.println("Día de la semana en el mes : " + calender.get(Calendar.DAY_OF_WEEK_IN_MONTH));

          System.out.println();


        %>
    </body>
</html>
