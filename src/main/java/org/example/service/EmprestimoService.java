package org.example.service;

import org.example.infrastructure.repository.EmprestimoRepository;
import org.example.infrastructure.repository.LivroRepository;
import org.example.model.Emprestimo;
import org.example.model.Livro;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class EmprestimoService {
    BibliotecaView bibliotecaView = new BibliotecaView();
    LivroRepository livroRepository = new LivroRepository();
    EmprestimoRepository emprestimoRepository = new EmprestimoRepository();

    public void registrarEmprestimo(){
        Emprestimo novoEmprestimo = bibliotecaView.cadastrarEmprestimo();
        Livro idLivro = novoEmprestimo.getIdLivro();
        try {
            emprestimoRepository.registrarEmprestimo(novoEmprestimo);
            livroRepository.atualizarStatusLivro(idLivro.getIdLivro());
            System.out.println("Emprestimo cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar emprestimo!");
            e.printStackTrace();
        }
    }

    public void registrarDevolucao(){

    }
}
