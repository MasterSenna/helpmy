package br.connectementor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.connectementor.entidades.Usuario;

public class UsuarioDAO {
    private Connection conexao;

    public UsuarioDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void inserirUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO Usuario (nome, email, senha, telefone, programacao, redes, ciberseguranca, businessIntelligence, gestaoTI, cloudComputing, devOps) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getTelefone());
            ps.setInt(5, usuario.getProgramacao());
            ps.setInt(6, usuario.getRedes());
            ps.setInt(7, usuario.getCiberseguranca());
            ps.setInt(8, usuario.getBusiness_Intelligence());
            ps.setInt(9, usuario.getGestao_TI());
            ps.setInt(10, usuario.getCloud_Computing());
            ps.setInt(11, usuario.getDevOps());

            ps.executeUpdate();
        }
    }

    // Outros métodos, como atualizar, listar, excluir, etc.
}
