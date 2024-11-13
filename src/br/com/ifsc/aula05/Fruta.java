package br.com.ifsc.aula05;

public class Fruta {
    private String tipo;
    private String nome;
    private int quantidadeEmEstoque;

    public Fruta(String tipo, String nome, int quantidadeEmEstoque) {
        this.tipo = tipo;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > quantidadeEmEstoque) {
            System.out.println("Não há estoque suficiente para vender " + quantidadeVendida + " unidades de " + nome + ".");
        } else {
            quantidadeEmEstoque -= quantidadeVendida;
            System.out.println("Venda de " + quantidadeVendida + " unidades de " + nome + " realizada.");
            System.out.println("Saldo restante: " + quantidadeEmEstoque + " unidades.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
