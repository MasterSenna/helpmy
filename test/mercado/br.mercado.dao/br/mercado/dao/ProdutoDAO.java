package br.mercado.dao;

import br.mercado.models.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();

        try {
            String sql = "SELECT * FROM produtos"; // Substitua "produtos" pelo nome da sua tabela no banco de dados

            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setDescricao(resultSet.getString("descricao"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setQuantidade(resultSet.getInt("quantidade"));

                produtos.add(produto);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produtos;
    }

    public void inserirProduto(Produto produto) {
        try {
            String sql = "INSERT INTO produtos (nome, descricao, preco, quantidade) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getDescricao());
            statement.setDouble(3, produto.getPreco());
            statement.setInt(4, produto.getQuantidade());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarProduto(Produto produto) {
        try {
            String sql = "UPDATE produtos SET nome=?, descricao=?, preco=?, quantidade=? WHERE id=?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getDescricao());
            statement.setDouble(3, produto.getPreco());
            statement.setInt(4, produto.getQuantidade());
            statement.setInt(5, produto.getId());

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirProduto(int id) {
        try {
            String sql = "DELETE FROM produtos WHERE id=?";

            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, id);

            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
