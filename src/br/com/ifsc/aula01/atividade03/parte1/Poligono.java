package br.com.ifsc.aula01.atividade03.parte1;

public class Poligono {

    private int numeroLados;
    private double medidaLado;

    public Poligono(int numeroLados, double medidaLado) {
        this.numeroLados = numeroLados;
        this.medidaLado = medidaLado;
    }

    public double calcularPerimetro() {
        return numeroLados * medidaLado;
    }

    public double calcularArea() {
        double apotema = medidaLado / (2 * Math.tan(Math.PI / numeroLados));
        return (calcularPerimetro() * apotema) / 2;
    }

    @Override
    public String toString() {
        return "Poligono ( Número de Lados: " + numeroLados + " e Medida do Lado: " + medidaLado + " )";
    }
}

