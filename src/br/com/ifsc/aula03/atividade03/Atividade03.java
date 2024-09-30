package br.com.ifsc.aula03.atividade03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Atividade03 {

    private static final Logger logger = Logger.getLogger(Atividade03.class.getName());
    public static final String FEMININO = "feminino";
    public static final String MASCULINO = "masculino";

    public static void atividade03() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1.70, MASCULINO));
        pessoas.add(new Pessoa(1.60, FEMININO));
        pessoas.add(new Pessoa(1.80, MASCULINO));
        pessoas.add(new Pessoa(1.55, FEMININO));
        pessoas.add(new Pessoa(1.75, MASCULINO));

        double maiorAltura = pessoas.stream()
                .max(Comparator.comparingDouble(Pessoa::getAltura))
                .orElseThrow(() -> new IllegalStateException("Lista de pessoas está vazia"))
                .getAltura();

        double menorAltura = pessoas.stream()
                .min(Comparator.comparingDouble(Pessoa::getAltura))
                .orElseThrow(() -> new IllegalStateException("Lista de pessoas está vazia"))
                .getAltura();

        double mediaAlturaHomens = pessoas.stream()
                .filter(p -> p.getSexo().equals("masculino"))
                .collect(Collectors.averagingDouble(Pessoa::getAltura));

        long numeroMulheres = pessoas.stream()
                .filter(p -> p.getSexo().equals("feminino"))
                .count();

        logger.log(Level.INFO, "Maior altura: {0}", maiorAltura);
        logger.log(Level.INFO, "Menor altura: {0}", menorAltura);
        logger.log(Level.INFO, "Média de altura dos homens: {0}", mediaAlturaHomens);
        logger.log(Level.INFO, "Número de mulheres: {0}", numeroMulheres);
    }
}
