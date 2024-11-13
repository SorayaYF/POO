package br.com.ifsc.aula07;

import java.time.Year;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private String sexo;
    private float salario;

    public Pessoa(String nome, int anoNascimento, String sexo, float salario) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public float getSalario() {
        return salario;
    }

    public int calcularIdade() {
        return Year.now().getValue() - anoNascimento;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Salário: " + salario);
    }
}