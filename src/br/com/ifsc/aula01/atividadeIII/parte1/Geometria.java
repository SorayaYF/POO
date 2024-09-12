package br.com.ifsc.aula01.atividadeIII.parte1;

import br.com.ifsc.aula01.atividadeI.Triangulo;
import br.com.ifsc.aula01.atividadeII.Quadrado;

import java.util.ArrayList;
import java.util.List;

public class Geometria {

    private String nome;
    private double areaTotal;
    private List<Object> figuras;

    public Geometria(String nome) {
        this.nome = nome;
        this.figuras = new ArrayList<>();
        this.areaTotal = 0;
    }

    public void adicionarFiguraPlana(Object figura) {
        figuras.add(figura);
    }

    public double calcularAreaTotal() {
        for (Object figura : figuras) {
            if (figura instanceof Quadrado) {
                areaTotal += ((Quadrado) figura).calcularArea();
            } else if (figura instanceof Triangulo) {
                areaTotal += ((Triangulo) figura).calcularArea();
            }
        }
        return areaTotal;
    }

    public void listarFiguras() {
        for (Object figura : figuras) {
            System.out.println(figura.toString());
        }
    }

    @Override
    public String toString() {
        return "Geometria ( Nome: " + nome + " )";
    }
}

