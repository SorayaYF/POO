package br.com.ifsc.aula01.atividade03.parte2;

import java.util.logging.Logger;

public class Funcionario extends Pessoa {

    private static final Logger logger = Logger.getLogger(Funcionario.class.getName());
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        super(nome);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void trabalhar() {
        logger.info(getNome() + " está trabalhando como " + cargo + ".");
    }

    public void receberSalario() {
        logger.info(getNome() + " recebeu o salário de R$ " + salario + ".");
    }

    public void baterPonto() {
        logger.info(getNome() + " bateu o ponto.");
    }
}

