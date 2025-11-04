package org.example.view;

import org.example.model.Livro;

import java.util.Scanner;

public class BibliotecaView {
    Scanner scINT = new Scanner(System.in);
    Scanner scSTR = new Scanner(System.in);

    public int mostrarMenu(){
        System.out.println("""
                1 - Cadastrar Livro
                2 - Cadastrar Emprestimo
                3 - Devolucao de Livro
                4 - Consultar Livros
                5 - Consultar Emprestimos
                """);
        int escolha = scINT.nextInt();

        return escolha;
    }

    public int capturarOpcao(int escolha){
        return escolha;
    }

    public Livro cadastrarLivro(){
        System.out.println("Insira o Titulo do Livro: ");
        String titulo = scSTR.nextLine();

        System.out.println("Insira o Autor do Livro: ");
        String autor = scSTR.nextLine();

        System.out.println("Insira o Ano de Publicacao do Livro: ");
        int anoPublicacao = scINT.nextInt();

        var novoLivro = new Livro(titulo, autor, anoPublicacao);

        return novoLivro;
    }
}