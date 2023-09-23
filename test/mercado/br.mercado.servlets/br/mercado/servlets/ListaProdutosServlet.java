package br.mercado.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.mercado.dao.ProdutoDAO;
import br.mercado.models.Produto;
import br.mercado.utils.ConnectionFactory; // Importe sua classe de conexão aqui

@WebServlet("/listaProdutos")
public class ListaProdutosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conexao = null;
        try {
            // Criar uma instância da ConnectionFactory
        	conexao = ConnectionFactory.conectar();

            // Crie uma instância do ProdutoDAO
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

            // Chame o método para listar os produtos
            List<Produto> produtos = produtoDAO.listarProdutos();

            // Defina os produtos como um atributo do request
            request.setAttribute("produtos", produtos);

            // Encaminhe a requisição para a página JSP que mostrará a lista de produtos
            request.getRequestDispatcher("listaProdutos.jsp").forward(request, response);
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    // Lidar com erros ao fechar a conexão, se necessário
                }
            }
        }
    }
}
