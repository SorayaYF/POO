package br.com.ifsc.aula01.atividade03.parte1;

import br.com.ifsc.aula01.atividade01.Triangulo;
import br.com.ifsc.aula01.atividade02.Quadrado;

public class Figura3D {

    private Object base;
    private double altura;

    public Figura3D(Object base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularVolume() {
        if (base instanceof Quadrado) {
            double lado = ((Quadrado) base).getLado();
            return lado * lado * altura;
        } else if (base instanceof Triangulo) {
            double areaBase = ((Triangulo) base).calcularArea();
            return (areaBase * altura) / 3;
        }
        return 0;
    }

    public double calcularAreaSuperficie() {
        if (base instanceof Quadrado) {
            double lado = ((Quadrado) base).getLado();
            return 6 * lado * lado;
        } else if (base instanceof Triangulo) {
            double areaBase = ((Triangulo) base).calcularArea();
            return areaBase + (3 * ((Triangulo) base).getBase() * altura);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Figura3D ( Base: " + base + " e Altura: " + altura + " )";
    }
}

