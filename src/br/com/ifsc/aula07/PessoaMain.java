package br.com.ifsc.aula07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Cadastro da pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Ano de Nascimento: ");
            int anoNascimento = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();
            System.out.print("Salário: ");
            float salario = scanner.nextFloat();
            scanner.nextLine(); // Consumir a nova linha

            Pessoa pessoa = new Pessoa(nome, anoNascimento, sexo, salario);
            pessoas.add(pessoa);
        }

        System.out.println("\nDados das pessoas cadastradas:");
        pessoas.forEach(Pessoa::imprimirDados);

        System.out.println("\nIdade das pessoas:");
        pessoas.forEach(p -> System.out.println(p.getNome() + ": " + p.calcularIdade() + " anos"));

        long homens = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("M")).count();
        long mulheres = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("F")).count();
        System.out.println("\nQuantidade de homens: " + homens + " (" + (homens * 100.0 / pessoas.size()) + "%)");
        System.out.println("Quantidade de mulheres: " + mulheres + " (" + (mulheres * 100.0 / pessoas.size()) + "%)");

        Pessoa homemMaisVelho = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("M")).min((p1, p2) -> Integer.compare(p1.getAnoNascimento(), p2.getAnoNascimento())).orElse(null);
        Pessoa mulherMaisNova = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("F")).max((p1, p2) -> Integer.compare(p1.getAnoNascimento(), p2.getAnoNascimento())).orElse(null);
        if (homemMaisVelho != null) {
            System.out.println("\nHomem mais velho: " + homemMaisVelho.getNome());
        }
        if (mulherMaisNova != null) {
            System.out.println("Mulher mais nova: " + mulherMaisNova.getNome());
        }

        double salarioTotal = pessoas.stream().mapToDouble(Pessoa::getSalario).sum();
        double mediaSalarial = salarioTotal / pessoas.size();
        System.out.println("\nSalário total: " + salarioTotal);
        System.out.println("Média salarial: " + mediaSalarial);
    }
}