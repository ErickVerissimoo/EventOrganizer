

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="POST" action="Home">
            <h1>Login</h1>
            <label for="email">Email: </label><br> 
            <input type="email" name="email" required><br>
            <label for="senha">Senha</label><br>
            <input type="password" name="senha" required><br>
            <button type="submit">Entrar</button>
        </form>
    </body>
</html>
