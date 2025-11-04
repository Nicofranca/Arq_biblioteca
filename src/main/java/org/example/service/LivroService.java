package org.example.service;

import org.example.infrastructure.repository.LivroRepository;
import org.example.model.Livro;
import org.example.view.BibliotecaView;

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

    }
}
