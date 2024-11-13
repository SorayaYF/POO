package br.com.ifsc.aula06;

public class ContaBancaria {

    public String titular;
    protected double saldo;
    private String senha;

    public ContaBancaria(String titular, double saldo, String senha) {
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public void depositar(double valor) {
        this.saldo += valor + (2 * valor);
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Saldo: " + saldo + ", Senha: " + senha;
    }
}
