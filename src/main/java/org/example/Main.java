package org.example;

import org.example.service.EmprestimoService;
import org.example.service.LivroService;
import org.example.view.BibliotecaView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BibliotecaView bibliotecaView = new BibliotecaView();
        LivroService livroService = new LivroService();
        EmprestimoService emprestimoService = new EmprestimoService();

        int escolha = 0;

        do{
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
        } while (escolha != 0);
    }
}