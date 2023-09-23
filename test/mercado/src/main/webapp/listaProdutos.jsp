<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inserir Produto</title>
</head>
<body>
    <h1>Inserir Produto</h1>
    
    <form action="InserirProdutoServlet" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required><br><br>
        
        <label for="descricao">Descrição:</label>
        <input type="text" id="descricao" name="descricao" required><br><br>
        
        <label for="preco">Preço:</label>
        <input type="number" id="preco" name="preco" required><br><br>
        
        <label for="quantidade">Quantidade:</label>
        <input type="number" id="quantidade" name="quantidade" required><br><br>
        
        <input type="submit" value="Inserir">
    </form>
</body>
</html>
