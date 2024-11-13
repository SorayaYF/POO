package br.com.ifsc.aula07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FuncionarioMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Cadastro do funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salário Base: ");
            float salarioBase = scanner.nextFloat();
            System.out.print("Horas Extras: ");
            float horasExtras = scanner.nextFloat();
            System.out.print("Número de Filhos: ");
            int numeroFilhos = scanner.nextInt();
            scanner.nextLine();

            Funcionario funcionario = new Funcionario(nome, sexo, cargo, salarioBase, horasExtras, numeroFilhos);
            funcionarios.add(funcionario);
        }

        
        System.out.println("\nFuncionários cadastrados:");
        funcionarios.forEach(System.out::println);
        
        long homens = funcionarios.stream().filter(f -> f.getSexo().equalsIgnoreCase("M")).count();
        long mulheres = funcionarios.stream().filter(f -> f.getSexo().equalsIgnoreCase("F")).count();
        System.out.println("\nQuantidade de homens: " + homens);
        System.out.println("Quantidade de mulheres: " + mulheres);

        
        Funcionario maisFilhos = funcionarios.stream().max(Comparator.comparingInt(Funcionario::getNumeroFilhos)).orElse(null);
        if (maisFilhos != null) {
            System.out.println("\nFuncionário com mais filhos: " + maisFilhos.getNome());
        }
        
        Funcionario maisHorasExtras = funcionarios.stream().max(Comparator.comparing(Funcionario::getHorasExtras)).orElse(null);
        if (maisHorasExtras != null) {
            System.out.println("Funcionário com mais horas extras: " + maisHorasExtras.getNome());
        }
        
        Funcionario maiorSalario = funcionarios.stream().max(Comparator.comparing(f -> {
            float valorHoraExtra = (f.getSalarioBase() / 220) * 1.20f;
            return f.getSalarioBase() + (f.getHorasExtras() * valorHoraExtra) + (f.getNumeroFilhos() * 18.5f);
        })).orElse(null);
        if (maiorSalario != null) {
            System.out.println("Funcionário com maior salário: " + maiorSalario);
        }
        
        double mediaSalarial = funcionarios.stream().mapToDouble(f -> {
            float valorHoraExtra = (f.getSalarioBase() / 220) * 1.20f;
            return f.getSalarioBase() + (f.getHorasExtras() * valorHoraExtra) + (f.getNumeroFilhos() * 18.5f);
        }).average().orElse(0.0);
        System.out.println("Média salarial dos funcionários: " + mediaSalarial);
    }
}