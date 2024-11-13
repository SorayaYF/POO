package br.com.ifsc.aula07;

public class Visitante {
    private String nome;
    private String cidade;
    private String sexo;
    private int anoNascimento;

    public Visitante(String nome, String cidade, String sexo, int anoNascimento) {
        this.nome = nome;
        this.cidade = cidade;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public int calcularIdade() {
        return java.time.Year.now().getValue() - anoNascimento;
    }
}