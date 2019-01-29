

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Página de prueba</h1>

        <%
          for (int i = 1; i < 9; i++) {
        %>

    <h<%=i%>>Cabecera <%=i%> </h<%=i%>>

        <%
          }
        %>





        <p>Hola soy un párrafo</p>

    </body>
</html>
