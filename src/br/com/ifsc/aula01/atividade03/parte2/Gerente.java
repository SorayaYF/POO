package br.com.ifsc.aula01.atividade03.parte2;

import java.util.logging.Logger;

public class Gerente extends Funcionario {

    private static final Logger logger = Logger.getLogger(Gerente.class.getName());
    private String departamentoGerenciado;
    private int subordinados;

    public Gerente(String nome, double salario, String cargo, String departamentoGerenciado, int subordinados) {
        super(nome, salario, cargo);
        this.departamentoGerenciado = departamentoGerenciado;
        this.subordinados = subordinados;
    }

    public void gerenciarEquipe() {
        logger.info(getNome() + " está gerenciando " + subordinados + " subordinados no departamento de " + departamentoGerenciado + ".");
    }

    public void aprovarProjeto() {
        logger.info(getNome() + " aprovou um projeto.");
    }

    public void darFeedback() {
        logger.info(getNome() + " está dando feedback aos subordinados.");
    }
}

