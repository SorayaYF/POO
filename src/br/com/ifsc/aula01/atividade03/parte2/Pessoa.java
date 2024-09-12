package br.com.ifsc.aula01.atividade03.parte2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pessoa {

    private static final Logger logger = Logger.getLogger(Pessoa.class.getName());
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void falar() {
        logger.log(Level.INFO, "{0} está falando.", nome);
    }

    public void andar() {
        logger.log(Level.INFO, "{0} está andando.", nome);
    }

    public void comer() {
        logger.log(Level.INFO, "{0} está comendo.", nome);
    }

    public String getNome() {
        return nome;
    }
}

