package br.com.ifsc.aula01.atividadeIII.parte2;

public class Pessoa {

    private String nome;
    private int idade;
    private String endereco;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, int idade, String endereco, String cpf, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

