package br.com.ifsc.aula01.atividade01;

public class Triangulo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base * 3;
    }

    public double getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Triangulo ( Base: " + base + " e Altura: " + altura + " )";
    }
}
