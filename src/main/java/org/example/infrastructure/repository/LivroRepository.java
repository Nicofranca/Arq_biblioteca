package org.example.infrastructure.repository;

import org.example.infrastructure.Conexao;
import org.example.model.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    public void cadastrarLivro(Livro livro) throws SQLException{
        String query = "INSERT INTO livro(titulo, autor, ano) VALUES (?,?,?,?)";

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

        return listarLivros;
    }

    public void atualizarStatusLivro() throws SQLException{

    }

}
