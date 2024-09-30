package br.com.ifsc.aula03.atividade03;

public class Pessoa {
    private double altura;
    private String sexo;

    public Pessoa(double altura, String sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }
}
