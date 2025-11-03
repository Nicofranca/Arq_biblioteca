package org.example.infrastructure.repository;

import org.example.model.Livro;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    public void cadastrarLivro(Livro livro) throws SQLException{

    }

    public List<Livro> consultarTodosLivros() throws SQLException{
        List<Livro> listarLivros = new ArrayList<>();

        return listarLivros;
    }

    public void atualizarStatusLivro() throws SQLException{

    }

}
