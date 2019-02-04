<%-- 
    Document   : ajedrez
    Created on : 04-feb-2019, 22:39:26
    Author     : Iván Pérez Molina

Crea una aplicación que dibuje un tablero de ajedrez mediante una tabla HTML
generada con bucles usando JSP y que sitúe dentro del tablero un alfil y un
caballo en posiciones aleatorias. Las dos figuras no pueden estar colocadas en
la misma casilla. Las filas y las columnas del tablero deben estar etiquetadas
correctamente.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            td{
                padding:20px;
            }
        </style>
    </head>
    <body>
        <%
        //Creo un numero aleatorio para el caballo y el arfil
        int azarAlfil=(int)(Math.random()*64)+1;
        int azarCaballo=(int)(Math.random()*64)+1;
        
        if(azarAlfil==azarCaballo){
        azarCaballo=(int)(Math.random()*64)+1;
        }
        %>
        <table width="400" height="400px" border="0" cellspacing="2" cellpadding="2" bgcolor="#000000">
            <tr align="center">
                <td id="1"></td>
                <td bgcolor="#ffffff" id="2"></td>
                <td id="3"></td>
                <td bgcolor="#ffffff" id="4"></td>
                <td id="5"></td>
                <td bgcolor="#ffffff" id="6"></td>
                <td id="7"></td>
                <td bgcolor="#ffffff" id="8"></td>
            </tr>
            <tr align="center">
                <td bgcolor="#ffffff">9</td>
                <td><font color="#ffffff">10</font></td>
                <td bgcolor="#ffffff">11</td>
                <td><font color="#ffffff">12</font></td>
                <td bgcolor="#ffffff">13</td>
                <td><font color="#ffffff">14</font></td>
                <td bgcolor="#ffffff">15</td>
                <td><font color="#ffffff">16</font></td>
            </tr>
            <tr align="center">
                <td><img src="img/caballo.png" width="25"></td>
                <td bgcolor="#ffffff">18</td>
                <td><font color="#ffffff">19</font></td>
                <td bgcolor="#ffffff">20</td>
                <td><font color="#ffffff">21</font></td>
                <td bgcolor="#ffffff">22</td>
                <td><font color="#ffffff">23</font></td>
                <td bgcolor="#ffffff">24</td>
            </tr>
            <tr align="center">
                <td bgcolor="#ffffff">25</td>
                <td><font color="#ffffff">26</font></td>
                <td bgcolor="#ffffff">27</td>
                <td><font color="#ffffff">28</font></td>
                <td bgcolor="#ffffff">29</td>
                <td><font color="#ffffff">30</font></td>
                <td bgcolor="#ffffff">31</td>
                <td><font color="#ffffff">32</font></td>
            </tr>  <tr align="center">
                <td><font color="#ffffff">33</font></td>
                <td bgcolor="#ffffff">34</td>
                <td><font color="#ffffff">35</font></td>
                <td bgcolor="#ffffff">36</td>
                <td><font color="#ffffff">37</font></td>
                <td bgcolor="#ffffff">38</td>
                <td><font color="#ffffff">39</font></td>
                <td bgcolor="#ffffff">40</td>
            </tr>
            <tr align="center">
                <td bgcolor="#ffffff">41</td>
                <td><font color="#ffffff">42</font></td>
                <td bgcolor="#ffffff">43</td>
                <td><font color="#ffffff">44</font></td>
                <td bgcolor="#ffffff">45</td>
                <td><font color="#ffffff">46</font></td>
                <td bgcolor="#ffffff">47</td>
                <td><font color="#ffffff">48</font></td>
            </tr>  <tr align="center">
                <td><font color="#ffffff">49</font></td>
                <td bgcolor="#ffffff">50</td>
                <td><font color="#ffffff">51</font></td>
                <td bgcolor="#ffffff">52</td>
                <td><font color="#ffffff">53</font></td>
                <td bgcolor="#ffffff">54</td>
                <td><font color="#ffffff">55</font></td>
                <td bgcolor="#ffffff">56</td>
            </tr>  <tr align="center">
                <td bgcolor="#ffffff">57</td>
                <td><font color="#ffffff">58</font></td>
                <td bgcolor="#ffffff">59</td>
                <td><font color="#ffffff">60</font></td>
                <td bgcolor="#ffffff">61</td>
                <td><font color="#ffffff">62</font></td>
                <td bgcolor="#ffffff">63</td>
                <td><font color="#ffffff">64</font></td>
            </tr>
        </table>
    </body>
</html>
