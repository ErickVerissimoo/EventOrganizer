<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" import="com.mycompany.eventorganizer.Model.*"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Evento</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .btn-success {
            transition: 0.3s ease;
        }
        .btn-success:hover {
            transform: scale(1.1);
        }
    </style>
</head>
<body>

<header class="bg-primary text-white text-center py-4">
    <h1>Editar Evento</h1>
</header>

<div class="container mt-4">
    <form method="POST" action="Editar" class="mt-5">
        <h3>${nome}</h3><br>
        <input type="hidden" name="evento" value="${evento}">
        <div class="form-group">
            <label for="newEventName">Novo Nome:</label>
            <input type="text" name="newEventName" id="newEventName" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="newEventDate">Nova Data:</label>
            <input type="date" name="newEventDate" id="newEventDate" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="newEventDescription">Nova Descrição:</label>
            <input type="text" name="newEventDescription" id="newEventDescription" class="form-control" required>
        </div>

        <button type="submit" class="btn btn-success">Salvar Alterações</button>
    </form>
</div>

<footer class="bg-light text-center py-3 mt-4">
    <p>&copy; 2024 Gerenciador de Eventos. Todos os direitos reservados.</p>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>