package br.com.ifsc.aula06;

import java.time.Year;

public class Livro {

    private static final String DISPONÍVEL = "Disponível";
    private static final String EMPRESTADO = "Emprestado";

    private String titulo;
    private String autor;
    private Integer ano;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = 1999;
        this.emprestado = false;
    }

    public Livro(String titulo, String autor, Integer ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public String consultarStatus() {
        String status = this.emprestado ? EMPRESTADO : DISPONÍVEL;
        return "O livro " + this.titulo + " está " + status;
    }

    public Integer consultaIdade() {
        return Year.now().getValue() - this.ano;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo
                + " | Autor: " + autor
                + " | Ano: " + ano
                + " | Status: " + consultarStatus()
                + " | Idade: " + consultaIdade();
    }
}
