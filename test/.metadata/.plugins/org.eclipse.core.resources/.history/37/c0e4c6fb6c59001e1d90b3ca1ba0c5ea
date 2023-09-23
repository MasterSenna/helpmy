package br.connectementor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Informações de conexão com o banco de dados MySQL
        String url = "jdbc:mysql://localhost:3306/dbmentor"; // Substitua "seubanco" pelo nome do seu banco de dados MySQL
        String user = "root"; // Substitua pelo nome de usuário do MySQL
        String password = "TecInfo"; // Substitua pela senha do MySQL

        try {
            // Carregar o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar estabelecer a conexão
            Connection connection = DriverManager.getConnection(url, user, password);

            // Se chegou até aqui, a conexão foi bem-sucedida
            System.out.println("Conexão com o banco de dados MySQL estabelecida com sucesso.");
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            // Tratar qualquer erro de conexão
            System.err.println("Erro ao conectar ao banco de dados MySQL: " + e.getMessage());
        }
    }
}
