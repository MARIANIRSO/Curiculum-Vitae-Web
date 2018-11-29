<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Resutados formulario</title>
        <link rel="stylesheet" type="text/css" href=<c:url value="resources/css/nuevoestilo2.css" /> />
    </head>
    <body class="main">
        <header >
            <nav >
                <ul class="menu1">
                    <li><a href ="<c:url value= "/home.htm" /> "> Home </a></li>
                    <li><a href ="<c:url value= "/catalogo.htm" /> "> Catálogo </a></li>
                </ul>
            </nav>
        </header>
    <center><h3>Resultado formulario</h3></center>

    <section class="main">
        <aside>
            <ul>
                <li>Nombre: <c:out value="${nombre}"/></li>
                <li>Apellido: <c:out value="${apellido}"/></li>
                <li>E-mail: <c:out value="${correo}"/></li>
                <li>Mensaje: <c:out value="${mensaje}"/></li>

            </ul>
        </aside>
    </section>

</body>
</html>
