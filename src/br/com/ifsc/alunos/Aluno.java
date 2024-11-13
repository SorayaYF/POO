package br.com.ifsc.alunos;

import javax.swing.*;
import java.util.List;
import java.util.stream.IntStream;

public class Aluno {

    String nome;

    List<Double> notas;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calcularMedia() {
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        return media >= 6.0
                ? "APROVADO"
                : String.format("REPROVADO - Faltam %.2f pontos para aprovação.", 6.0 - media);
    }

    public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null,
                String.format("Nome do Aluno: %s%nMédia: %.2f%nSituação: %s",
                        nome, calcularMedia(), verificarSituacao())
        );
    }

    public static String capturarNome(int numeroAluno) {
        return JOptionPane.showInputDialog("Digite o nome do aluno " + numeroAluno + ":");
    }

    public static List<Double> capturarNotas(int quantidadeNotas, int numeroAluno) {
        return IntStream.rangeClosed(1, quantidadeNotas)
                .mapToObj(i -> {
                    while (true) {
                        try {
                            String notaStr = JOptionPane.showInputDialog("Digite a nota " + i + " do aluno " + numeroAluno + ":");
                            return Double.parseDouble(notaStr);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                        }
                    }
                })
                .toList();
    }
}
