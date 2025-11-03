package org.example.view;

import org.example.model.Livro;
import org.example.service.EmprestimoService;
import org.example.service.LivroService;

import java.util.Scanner;

public class BibliotecaView {
    private Scanner sc = new Scanner(System.in);
    private LivroService livroService = new LivroService();
    private EmprestimoService emprestimoService = new EmprestimoService();

    public BibliotecaView(Scanner sc, LivroService livroService, EmprestimoService emprestimoService) {
        this.sc = sc;
        this.livroService = livroService;
        this.emprestimoService = emprestimoService;
    }

    public BibliotecaView() {

    }

    public int mostrarMenu(){
        System.out.println("""
                1 - Cadastrar Livro
                2 - Cadastrar Emprestimo
                3 - Devolucao de Livro
                4 - Consultar Livros
                5 - Consultar Emprestimos
                """);
        return capturarOpcao();
    }

    public int capturarOpcao(){
        int escolha = sc.nextInt();

        return escolha;
    }
}
