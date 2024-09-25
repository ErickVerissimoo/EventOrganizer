<%-- 
    Document   : Eventos
    Created on : 22 de set. de 2024, 14:29:40
    Author     : Erick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eventos</title>
    </head>
    <body>
        <form method="POST" action="Eventos">
            <h1>Adicione um evento</h1><br>
        <label for="data">Data do evento:</label><br>
        <input type="date" name="eventDate"><br>
         <label for="nome">Nome do evento:</label><br>
         <input type="text" name="eventName"><br>
          <label for="descricao">Descrição do evento:</label><br>
          <input type="text" name="eventDes"><br>
        <button type="submit"> Adicionar</button>
        </form>
    </body>
</html>
