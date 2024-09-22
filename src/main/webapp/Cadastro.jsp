<%-- 
    Document   : Cadastro
    Created on : 22 de set. de 2024, 14:28:42
    Author     : Erick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <form method="POST" action="UserController">
        <h1>Cadastro</h1>
        <label for="EMAIL">Email: </label><br>
        <input type="email" name="EMAIL" required><br>
        <label for="SENHA">Senha: </label><br>
        <input name="SENHA" type="password" required><br>
        <label for="ConfirmeSe">Confirme a senha: </label><br>
        <input type="password" name="ConfirmaeSe" required>
        <button type="submit">Cadastrar</button>
        </form>
        </body>
</html>
