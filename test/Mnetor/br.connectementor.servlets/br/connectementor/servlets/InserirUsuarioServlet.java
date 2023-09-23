package br.connectementor.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.connectementor.dao.ConnectionFactory;
import br.connectementor.dao.UsuarioDAO;
import br.connectementor.entidades.Usuario;

@WebServlet("/inserirUsuario")
public class InserirUsuarioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String telefone = request.getParameter("telefone");

        int Programacao = 0;
        int Redes = 0;
        int Ciberseguranca = 0;
        int Banco_Dados = 0; // Correção aqui
        int Business_Intelligence = 0;
        int Gestao_TI = 0;
        int Cloud_Computing = 0;
        int DevOps = 0;

        if (request.getParameter("Programacao") != null && !request.getParameter("Programacao").isEmpty()) {
            Programacao = Integer.parseInt(request.getParameter("Programacao"));
        }
        if (request.getParameter("Redes") != null && !request.getParameter("Redes").isEmpty()) {
            Redes = Integer.parseInt(request.getParameter("Redes"));
        }
        if (request.getParameter("Ciberseguranca") != null && !request.getParameter("Ciberseguranca").isEmpty()) {
            Ciberseguranca = Integer.parseInt(request.getParameter("Ciberseguranca"));
        }
        if (request.getParameter("Banco_Dados") != null && !request.getParameter("Banco_Dados").isEmpty()) {
            Banco_Dados = Integer.parseInt(request.getParameter("Banco_Dados"));
        }
        if (request.getParameter("Business_Intelligence") != null && !request.getParameter("Business_Intelligence").isEmpty()) {
            Business_Intelligence = Integer.parseInt(request.getParameter("Business_Intelligence"));
        }
        if (request.getParameter("GestaoTI") != null && !request.getParameter("GestaoTI").isEmpty()) {
            Gestao_TI = Integer.parseInt(request.getParameter("GestaoTI"));
        }
        if (request.getParameter("Cloud_Computing") != null && !request.getParameter("Cloud_Computing").isEmpty()) {
            Cloud_Computing = Integer.parseInt(request.getParameter("Cloud_Computing"));
        }
        if (request.getParameter("DevOps") != null && !request.getParameter("DevOps").isEmpty()) {
            DevOps = Integer.parseInt(request.getParameter("DevOps"));
        }

        Usuario usuario = new Usuario(DevOps, nome, email, senha, telefone, Programacao, Redes, Ciberseguranca,
                Banco_Dados, Business_Intelligence, Gestao_TI, Cloud_Computing, DevOps);

        try (Connection connection = ConnectionFactory.getConnection()) {
            UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
            usuarioDAO.inserirUsuario(usuario);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException e) {
            throw new ServletException("Erro ao inserir usuário: " + e.getMessage());
        }
    }
}
