package br.com.ifsc.aula03.atividade02;

import br.com.ifsc.aula03.Util.OperacoesUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade02 {

    private static final Logger logger = Logger.getLogger(Atividade02.class.getName());

    public static void atividade02() {
        float celsius = 30.5f;

        logger.log(Level.INFO, "Celsius: {0}", celsius);
        logger.log(Level.INFO, "Fahrenheit: {0}", (celsius * 1.8) + 32);
        logger.log(Level.INFO, "Kelvin: {0}", celsius + 273.15);

        //Exemplo de cálculos utilizando os métodos
        logger.log(Level.INFO, "Fahrenheit: {0}",
                OperacoesUtil.somar(
                        OperacoesUtil.multiplicar(celsius, 1.8f),
                        32));
        logger.log(Level.INFO, "Kelvin: {0}",
                OperacoesUtil.somar(celsius, 273.15f));
    }
}
