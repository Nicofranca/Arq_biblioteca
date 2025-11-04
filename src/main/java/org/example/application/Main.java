package org.example.application;

import org.example.service.EmprestimoService;
import org.example.service.LivroService;
import org.example.view.BibliotecaView;


public class Main {
    public static void main(String[] args) {
        LivroService livroService = new LivroService();
        EmprestimoService emprestimoService = new EmprestimoService();

        System.out.println("--");

        int escolha = 0;


        do{
            var bibliotecaView = new BibliotecaView();
            escolha = bibliotecaView.mostrarMenu();
            switch (escolha){
                case 1 -> livroService.cadastrarLivro();
                case 2 -> emprestimoService.registrarEmprestimo();
                case 3 -> emprestimoService.registrarDevolucao();
                case 4 -> livroService.consultarLivrosCadastrados();
                case 0 -> {
                    return;
                }
            }
        } while (true);
    }
}