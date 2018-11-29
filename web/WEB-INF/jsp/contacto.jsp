<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="utf-8"/>
        <title>Contacto</title>
        <link rel="stylesheet" type="text/css" href=<c:url value="resources/css/nuevoestilo2.css" /> />
    </head>
    <body class="main">

        <header >
            <nav >
                <ul class="menu1">
                    <li class=""><a href ="<c:url value= "/home.htm" /> "> Home </a></li>
                    <li class=""><a href ="<c:url value= "/catalogo.htm" /> "> Catálogo </a></li>
                </ul>
            </nav>
        </header>
                <h3>Realizá tu consulta</h3>
                <h3 class="h2">ingrese sus datos y regsitrate</h3>

        <section class="main">
            <aside>
            <form:form >
                <p>
                    <form:label path="nombre">Nombre</form:label>
                    <form:input path="nombre"/>
                </p> 
                <p>
                    <form:label path="apellido">Apellido</form:label>
                    <form:input path="apellido"/>
                </p>
                <p>
                    <form:label path="correo">E-mail</form:label>
                    <form:input path="correo"/>
                </p>
                <form:textarea path="mensaje"/>
                <hr/>
                <form:button>Enviar</form:button>
            </form:form>
        </aside>
            <h3>Si estas interesado en poder</h3><center><h1>COMPRAR, VENDER o CANJEAR</h1></center> <h3> juegos ingresa tus datos y a la brevedad tendras una respuesta</h3
        </section>
        <footer>
            <p>Cabrera Mariano David -Compra y venta online 2018</p>
            <p><h6>para mas infroacion escribinos a mariano.d.cabrera@gmail.com</h6></p>
        </footer>
    </body>

</html>
