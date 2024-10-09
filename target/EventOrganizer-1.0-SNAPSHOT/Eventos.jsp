<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" import="com.mycompany.eventorganizer.Model.*"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eventos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .evento {
            transition: transform 0.3s ease;
            cursor: pointer;
        }
        .evento:hover {
            transform: scale(1.05);
        }
        .btn-success{
            transition: 0.3s ease;
        }
        .btn-success:hover{
            transform: scale(1.1);
        }
    </style>
</head>
<body>

<header class="bg-primary text-white text-center py-4">
    <h1>Gerenciador de Eventos</h1>
</header>

<div class="container mt-4">
    <div class="row">
        <c:forEach var="entry" items="${eventosMap.entrySet()}">
            <div class="col-md-4 mb-4">
        <div class="card evento" onclick="window.location.href='Editar?id=${entry.key}';">                    <div class="card-body" >
                        <h5 class="card-title">${entry.value.nome}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">${entry.value.data}</h6>
                        <p class="card-text">${entry.value.descricao}</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

    <form method="POST" id="form1" action="Eventos" class="mt-5">
        <h2>Adicione um Evento</h2>
        <div class="form-group">
            <label for="eventDate">Data do Evento:</label>
            <input type="date" name="eventDate" id="eventDate" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="eventName">Nome do Evento:</label>
            <input type="text" name="eventName" id="eventName" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="eventDes">Descrição do Evento:</label>
            <input type="text" name="eventDes" id="eventDes" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-success">Adicionar</button>
    </form>
</div>

<footer class="bg-light text-center py-3 mt-4">
    <p>&copy; 2024 Gerenciador de Eventos. Todos os direitos reservados.</p>
</footer>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
    window.onload = function() {
        document.getElementById("form1").reset();
    };
</script>

</body>
</html>