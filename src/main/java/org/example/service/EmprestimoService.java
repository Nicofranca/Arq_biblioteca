package org.example.service;

import org.example.infrastructure.repository.EmprestimoRepository;
import org.example.model.Emprestimo;
import org.example.view.BibliotecaView;

import java.sql.SQLException;

public class EmprestimoService {
    BibliotecaView bibliotecaView = new BibliotecaView();
    EmprestimoRepository emprestimoRepository = new EmprestimoRepository();

    public void registrarEmprestimo(){
        Emprestimo novoEmprestimo = bibliotecaView.cadastrarEmprestimo();

        try {
            emprestimoRepository.registrarEmprestimo(novoEmprestimo);
            System.out.println("Emprestimo cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar emprestimo!");
            e.printStackTrace();
        }
    }

    public void registrarDevolucao(){

    }
}
