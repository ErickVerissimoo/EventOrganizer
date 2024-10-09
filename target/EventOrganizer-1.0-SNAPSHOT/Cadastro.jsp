<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mycompany.eventorganizer.Model.*"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<header class="bg-primary text-white text-center py-4">
    <h1>Cadastro de Usuário</h1>
</header>

<div class="container mt-4">
    <form method="POST" action="Cadastro" class="border p-4 rounded shadow">
        <h2 class="mb-4">Preencha os Dados</h2>
        
        <div class="form-group">
            <label for="EMAIL">Email:</label>
            <input type="email" name="EMAIL" id="EMAIL" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="SENHA">Senha:</label>
            <input type="password" name="SENHA" id="SENHA" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="ConfirmaeSe">Confirme a Senha:</label>
            <input type="password" name="ConfirmaeSe" id="ConfirmaeSe" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-success btn-block">Cadastrar</button>
    </form>

    <div class="text-center mt-3">
        <a href="index.jsp">Já é cadastrado?</a>
    </div>
</div>

<footer class="bg-light text-center py-3 mt-4">
    <p>&copy; 2024 Gerenciador de Eventos. Todos os direitos reservados.</p>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>