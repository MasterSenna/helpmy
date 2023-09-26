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

        int programacao = Integer.parseInt(request.getParameter("programacao"));
        int redes = Integer.parseInt(request.getParameter("redes"));
        int ciberseguranca = Integer.parseInt(request.getParameter("ciberseguranca"));
        int businessIntelligence = Integer.parseInt(request.getParameter("businessIntelligence"));
        int gestaoTI = Integer.parseInt(request.getParameter("gestaoTI"));
        int cloudComputing = Integer.parseInt(request.getParameter("cloudComputing"));
        int devops = Integer.parseInt(request.getParameter("devops"));

        Usuario usuario = new Usuario(0, nome, email, senha, telefone, programacao, redes, ciberseguranca, businessIntelligence, gestaoTI, cloudComputing, devops);

        try (Connection connection = ConnectionFactory.getConnection()) {
            UsuarioDAO usuarioDAO = new UsuarioDAO(connection);
            usuarioDAO.inserirUsuario(usuario);
            response.sendRedirect("sucesso.jsp");
        } catch (SQLException e) {
            throw new ServletException("Erro ao inserir usuário: " + e.getMessage());
        }
    }
}
