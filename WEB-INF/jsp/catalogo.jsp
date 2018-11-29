<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<head>
    <meta  charset="utf-8">
    <title>Catalogo de Juegos</title>
    <link rel="stylesheet" type="text/css" href=<c:url value="resources/css/nuevoestilo2.css" /> />
</head>

<header>
    <h2 class="h1">Elije tu listado de juegos favoritos</h2>
    <nav >
        <ul class="menu1">
            <li><a  href ="<c:url value= "/home.htm" /> "> Home </a></li>
            <li><a  href ="<c:url value= "/contacto.htm"/>"> Contacto </a></li>
        </ul>
    </nav>
</header>

<section class="main">
    <section class="main">
        <articles>





            <img class="img"  src="<c:url value="resources/imagenes/ps4/fifa18.jpg"/>  " alt="Fifa 2018(foto)" />
            <img class="img"  src="<c:url value="resources/imagenes/ps3/mgsv.jpg"/>    " alt="Metal Gear solid V Phantom Pain(foto)" />
            <img class="img"  src="<c:url value="resources/imagenes/ps4/tew1ps4.jpg"/> " alt="The Evil Within(foto)" />
            <img class="img"  src="<c:url value="resources/imagenes/ps3/asc4.jpg"/>    " alt="AssassinS C R E E D IV Black Flag(foto)" />   


            <nav>



                <ul class="menu1">
                    <h2 class="h1">PROXIMAMENTE ISOs!!!</h2>
                    <li><a  href ="<c:url value= "/juegosps2.htm"/>"> Listado de juegos para Playstation 2</a></li>
                    <li><a  href ="<c:url value= "/juegosps3.htm"/>"> Listado de juegos para Playstation 3</a></li>
                    <li><a  href ="<c:url value= "/juegosps4.htm"/>"> Listado de juegos para Playstation 4</a></li>

                </ul>
            </nav>
        </articles>
    </section >
</section >

<footer class="blockquote-footer">
    <p>Cabrera Mariano David -Compra y venta online 2018</p>
</footer>



