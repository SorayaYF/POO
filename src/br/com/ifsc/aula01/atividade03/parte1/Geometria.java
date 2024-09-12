package br.com.ifsc.aula01.atividade03.parte1;

import br.com.ifsc.aula01.atividade01.Triangulo;
import br.com.ifsc.aula01.atividade02.Quadrado;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Geometria {

    private static final Logger logger = Logger.getLogger(Geometria.class.getName());
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
        if (logger.isLoggable(Level.INFO)) {
            for (Object figura : figuras) {
                logger.info(figura.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Geometria ( Nome: " + nome + " )";
    }
}

