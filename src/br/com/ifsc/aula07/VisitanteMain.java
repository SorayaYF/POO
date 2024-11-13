package br.com.ifsc.aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class VisitanteMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Visitante> visitantes = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            System.out.println("Cadastro do visitante " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();
            System.out.print("Ano de Nascimento: ");
            int anoNascimento = scanner.nextInt();
            scanner.nextLine();

            Visitante visitante = new Visitante(nome, cidade, sexo, anoNascimento);
            visitantes.add(visitante);

            if (visitantes.size() >= 10) {
                System.out.print("Deseja encerrar o cadastro? (S/N): ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }

        System.out.println("\nNúmero total de visitantes: " + visitantes.size());

        long homens = visitantes.stream().filter(v -> v.getSexo().equalsIgnoreCase("M")).count();
        long mulheres = visitantes.stream().filter(v -> v.getSexo().equalsIgnoreCase("F")).count();
        System.out.println("Número de Homens: " + homens);
        System.out.println("Número de Mulheres: " + mulheres);

        double percentualHomens = (homens * 100.0) / visitantes.size();
        double percentualMulheres = (mulheres * 100.0) / visitantes.size();
        System.out.println("Percentual de Homens: " + percentualHomens + "%");
        System.out.println("Percentual de Mulheres: " + percentualMulheres + "%");

        long menoresDe18 = visitantes.stream().filter(v -> v.calcularIdade() < 18).count();
        System.out.println("Visitantes com menos de 18 anos: " + menoresDe18);

        Set<String> cidades = visitantes.stream().map(Visitante::getCidade).collect(Collectors.toSet());
        System.out.println("Número de cidades dos visitantes: " + cidades.size());
    }
}