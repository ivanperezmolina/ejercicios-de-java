<%-- 
    Document   : calendario
    Created on : 04-feb-2019, 18:32:19
    Author     : Iván Pérez Molina
Escribe una aplicación que genere el calendario de un mes. Se pedirá el
nombre del mes, el año, el texto que queremos que aparezca sobre el
calendario, el día de la semana en que cae el día 1 y el número de días que
tiene el mes.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio11</title>
    </head>
    <body>
        <%
          String nombreMes = request.getParameter("nombreMes");
          int numeroAño = Integer.parseInt(request.getParameter("numeroAño"));
          String texto = request.getParameter("texto");
          String nombreDia1 = request.getParameter("nombreDia1");
          int diasMes = Integer.parseInt(request.getParameter("diasMes"));
        %>
        
        <h1><%=nombreMes%> del <%=numeroAño%></h1>
        <p><%=texto%></p>
        
        <table class="curr"> 
            <thead>
                <tr><td>L</td><td>M</td><td>X</td><td>J</td><td>V</td><td>S</td><td>D</td></tr> 
                
            </thead>
    <tbody> 
        <tr><td class="nil"></td><td class="nil"></td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td></tr> 
        <tr><td>6</td><td>7</td><td>8</td><td>9</td><td>10</td><td class="today">11</td><td>12</td></tr> 
        <tr><td>13</td><td>14</td><td>15</td><td>16</td><td>17</td><td>18</td><td>19</td></tr> 
        <tr><td>20</td><td>21</td><td>22</td><td>23</td><td>24</td><td>25</td><td>26</td></tr> 
        <tr><td>27</td><td>28</td><td>29</td><td>30</td><td class="nil"></td><td class="nil"></td><td class="nil"></td></tr> 
    </tbody> 
</table>
    </body>
</html>
