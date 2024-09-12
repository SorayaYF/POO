package br.com.ifsc.aula01.atividade02;

public class Quadrado {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return lado * 4;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Quadrado ( Lado: " + lado + " )";
    }
}
