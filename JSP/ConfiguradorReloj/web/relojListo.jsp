<%-- 
    Document   : relojListo
    Created on : 29-ene-2019, 17:35:24
    Author     : Iván Pérez Molina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página oficial de Rolex</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>

    <body>
        <h1 class="text-center">Página oficial de Rolex</h1>
        <h5>Su reloj esta listo; consulte si es de su gusto y precio</h5>
        <img src="img/<%= request.getParameter("color")%><%=request.getParameter("correa")%>.png">

        <!--VERDE ORO-->

        <%
          if (request.getParameter("color").equals("verde") && request.getParameter("correa").equals("oro")) {
        %>
        <div class="alert alert-success" role="alert">
            El producto está disponible!
        </div> 
        <br>
        PRECIO:<span class="badge badge-pill badge-success">800€</span>
        <p>          </p><button type="button" class="btn btn-primary" src="https://www.rolex.com/es">Comprar!</button>
        <% }
        %>

        <!--VERDE ACERO-->

        <%
          if (request.getParameter("color").equals("verde") && request.getParameter("correa").equals("acero")) {
        %>
        <div class="alert alert-warning" role="alert">
            Producto solo disponible en tienda
        </div>
        <br>
        PRECIO:<span class="badge badge-pill badge-success">600€</span>
        <p>          </p><button type="button" class="btn btn-primary" src="https://www.rolex.com/es">Avisame cuando este disponible online</button>
        <% }
        %>



        <!--AZUL ORO-->

        <%
          if (request.getParameter("color").equals("azul") && request.getParameter("correa").equals("oro")) {
        %>
        <div class="alert alert-warning" role="alert">
            Producto solo disponible en tienda
        </div>
        <br>
        PRECIO:<span class="badge badge-pill badge-success">700€</span>
        <p>          </p><button type="button" class="btn btn-primary" src="https://www.rolex.com/es">Avisame cuando este disponible online</button>
        <% }
        %>



        <!--AZUL ACERO-->

        <%
          if (request.getParameter("color").equals("azul") && request.getParameter("correa").equals("acero")) {
        %>
        <div class="alert alert-danger" role="alert">
            No disponible temporalmente!
        </div>
        <br>
        PRECIO:<span class="badge badge-pill badge-success">500€</span>
        <p>          </p><button type="button" class="btn btn-primary" src="https://www.rolex.com/es">Avisame cuando este disponible</button>
        <% }
        %>



        <!--NEGRO ORO-->

        <%
          if (request.getParameter("color").equals("negro") && request.getParameter("correa").equals("oro")) {
        %>
        <div class="alert alert-info" role="alert">
            Producto demasiado caro para venta por internet. Acuda a su tienda
        </div>
        <br>
        PRECIO:<span class="badge badge-pill badge-success">1000€</span>
        <p>          </p><button type="button" class="btn btn-primary" src="https://www.rolex.com/es">Ver tu tienda mas cercana</button>
        <% }
        %>



        <!--NEGRO ACERO-->

        <%
          if (request.getParameter("color").equals("negro") && request.getParameter("correa").equals("acero")) {
        %>
        <div class="alert alert-danger" role="alert">
            No disponible temporalmente!
        </div>
        <br>
        PRECIO:<span class="badge badge-pill badge-success">900€</span>
        <p>          </p><button type="button" class="btn btn-primary" src="https://www.rolex.com/es">Avisame cuando este disponible</button>
        <% }
        %>
    </body>
</html>
