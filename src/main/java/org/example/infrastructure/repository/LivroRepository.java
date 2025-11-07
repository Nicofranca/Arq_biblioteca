package org.example.infrastructure.repository;

import org.example.infrastructure.Conexao;
import org.example.model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    public void cadastrarLivro(Livro livro) throws SQLException{
        String query = "INSERT INTO livros(titulo, autor, ano) VALUES (?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());

            stmt.executeUpdate();
        }
    }

    public List<Livro> consultarTodosLivros() throws SQLException{
        List<Livro> listarLivros = new ArrayList<>();
        String query = "SELECT id, titulo, autor, ano, disponivel FROM livros";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next()){
                    var novoLivro = new Livro();
                    novoLivro.setIdLivro(rs.getInt("id"));
                    novoLivro.setTitulo(rs.getString("titulo"));
                    novoLivro.setAutor(rs.getString("autor"));
                    novoLivro.setAno(rs.getInt("ano"));
                    novoLivro.setDisponivel(rs.getBoolean("disponivel"));

                    listarLivros.add(novoLivro);

                }
            }
        }

        return listarLivros;
    }

    public void atualizarStatusLivroFalse(int idLivro) throws SQLException{
        String query = "UPDATE livros SET disponivel = false WHERE id = ?";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idLivro);
            stmt.executeUpdate();
        }
    }

    public void atualizarStatusLivroTrue(int idLivro) throws SQLException{
        String query = "UPDATE livros SET disponivel = true WHERE id = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idLivro);
            stmt.executeUpdate();
        }
    }



}
