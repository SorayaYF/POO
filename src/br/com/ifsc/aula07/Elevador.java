package br.com.ifsc.aula07;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int ocupacao;

    public void inicializa(int capacidade, int totalAndares, int ocupacao) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.ocupacao = ocupacao;
        this.andarAtual = 0;
    }

    public void entra(int quant) {
        if (ocupacao + quant <= capacidade) {
            ocupacao += quant;
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    public void sai(int quant) {
        if (ocupacao >= quant) {
            ocupacao -= quant;
        } else {
            System.out.println("Não há pessoas suficientes no elevador!");
        }
    }

    public void sai() {
        if (ocupacao > 0) {
            ocupacao--;
        } else {
            System.out.println("O elevador está vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void sobe(int quant) {
        if (andarAtual + quant <= totalAndares) {
            andarAtual += quant;
        } else {
            System.out.println("Não é possível subir tantos andares!");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    public String mostrar() {
        return "Andar Atual: " + andarAtual + "\nTotal de Andares: " + totalAndares + "\nOcupação: " + ocupacao + "\nCapacidade: " + capacidade;
    }
}