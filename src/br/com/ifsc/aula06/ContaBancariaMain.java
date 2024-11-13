package br.com.ifsc.aula06;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Jagunço", 1000.0, "1234");
        System.out.println(conta);

        conta.titular = "Marta";
        conta.saldo = 2000.0;
        conta.setSenha("5678");

        conta.depositar(500.0);

        System.out.println(conta);
    }
}
