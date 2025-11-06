package org.example.infrastructure.repository;

import org.example.infrastructure.Conexao;
import org.example.model.Emprestimo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmprestimoRepository {

    public void registrarEmprestimo(Emprestimo emprestimo) throws SQLException {
        String query = "INSERT INTO emprestimos(livro_id, usuario_id, data_emprestimo) VALUES (?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, emprestimo.getIdLivro().getIdLivro());
            stmt.setInt(2, emprestimo.getIdUsuario().getIdUsuario());
            stmt.setDate(3, Date.valueOf(emprestimo.getDataEmprestimo()));

            stmt.executeUpdate();

        }
    }

    public void registrarDevolucao(Emprestimo emprestimo) throws SQLException{
        String query = "UPDATE emprestimos SET data_devolucao = ? WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDate(1, Date.valueOf(emprestimo.getDataEmprestimo()));
            stmt.setInt(2, emprestimo.getIdEmprestimo());
            stmt.executeUpdate();
        }
    }
}
