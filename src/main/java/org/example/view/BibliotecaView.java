package org.example.view;

import org.example.model.Emprestimo;
import org.example.model.Livro;
import org.example.model.Usuario;

import java.time.LocalDate;
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

        return new Livro(titulo, autor, anoPublicacao);
    }

    public Emprestimo cadastrarEmprestimo(){
        System.out.println("Insira o id do Livro: ");
        int idLivro = scINT.nextInt();

        System.out.println("Insira o id do Usuario: ");
        int idUsuario = scINT.nextInt();

        Livro livro = new Livro();
        livro.setIdLivro(idLivro);

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(idUsuario);

        var novoEmprestimo = new Emprestimo(usuario,livro);
        novoEmprestimo.setDataEmprestimo(LocalDate.now());

        return novoEmprestimo;
    }

    public Emprestimo devolucao(){
        System.out.println("Insira o id do Emprestimo: ");
        int idEmprestimo = scINT.nextInt();

        return new Emprestimo(idEmprestimo);
    }
}