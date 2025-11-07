package org.example.model;

import java.time.LocalDate;

public class Emprestimo {
    private int idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Usuario idUsuario;
    private Livro idLivro;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emprestimo() {
    }

    public Emprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Emprestimo(Usuario idUsuario, Livro idLivro) {
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
    }

    public Emprestimo(LocalDate dataEmprestimo, Usuario idUsuario, Livro idLivro) {
        this.dataEmprestimo = dataEmprestimo;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Usuario idUsuario, Livro idLivro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
    }

    public Emprestimo(int idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucao, Usuario idUsuario, Livro idLivro, int id) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.idUsuario = idUsuario;
        this.idLivro = idLivro;
        this.id = id;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Livro getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Livro idLivro) {
        this.idLivro = idLivro;
    }
}
