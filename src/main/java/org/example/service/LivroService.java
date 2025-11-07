package org.example.service;

import org.example.infrastructure.repository.LivroRepository;
import org.example.model.Livro;
import org.example.view.BibliotecaView;

import java.sql.SQLException;
import java.util.List;

public class LivroService {

    BibliotecaView bibliotecaView = new BibliotecaView();
    LivroRepository livroRepository = new LivroRepository();

    public void cadastrarLivro(){
        Livro novoLivro = bibliotecaView.cadastrarLivro();

        try {
            livroRepository.cadastrarLivro(novoLivro);
            System.out.println("Livro Cadastrado!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar Livro");
            e.printStackTrace();
        }
    }

    public void consultarLivrosCadastrados(){
        var lista = new LivroRepository();

        try {
            List<Livro> listarLivros = lista.consultarTodosLivros();

            for (Livro livros : listarLivros){
                System.out.print(" - id: "+ livros.getIdLivro());
                System.out.print(" - Titulo: " + livros.getTitulo());
                System.out.print(" - Autor: " + livros.getAno());
                System.out.println(" - Disponibilidade: " + livros.isDisponivel() + "\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
