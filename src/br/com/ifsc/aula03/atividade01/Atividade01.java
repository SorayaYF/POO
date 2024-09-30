package br.com.ifsc.aula03.atividade01;

import br.com.ifsc.aula03.Util.OperacoesUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade01 {

    private static final Logger logger = Logger.getLogger(Atividade01.class.getName());

    public static void atividade01() {
        String titulo = "Programação Orientada a Objetos";
        int a = 10;
        int b = 25;
        float c = 30.5f;
        float d = 40.5f;

        logger.log(Level.INFO, "Nome: {0}", titulo);
        logger.log(Level.INFO, "Equação 1: {0}", (a * b) / a);
        logger.log(Level.INFO, "Equação 2: {0}", ((Math.pow(c, 2)) * d) / c);
        logger.log(Level.INFO, "Equação 3: {0}", (d / c));
        logger.log(Level.INFO, "Equação 4: {0}", (b - (2 * a)));

        //Exemplo de cálculos utilizando os métodos
        logger.log(Level.INFO, "Equação 1: {0}", OperacoesUtil.dividir(
                OperacoesUtil.multiplicar(a, b),
                a));
        logger.log(Level.INFO, "Equação 2: {0}", OperacoesUtil.dividir(
                OperacoesUtil.multiplicar(
                        OperacoesUtil.multiplicar(c, c),
                        d),
                c));
        logger.log(Level.INFO, "Equação 3: {0}", OperacoesUtil.dividir(d, c));
        logger.log(Level.INFO, "Equação 4: {0}", OperacoesUtil.subtrair(b,
                OperacoesUtil.multiplicar(2, a)));
    }
}
