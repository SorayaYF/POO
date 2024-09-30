package br.com.ifsc.aula03.atividade04;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade04 {
    private static final Logger logger = Logger.getLogger(Atividade04.class.getName());

    public static void atividade04() {
        Scanner sc = new Scanner(System.in);

        logger.info("Digite as 3 medidas dos lados do tri�ngulo X:");
        float xA = sc.nextFloat();
        float xB = sc.nextFloat();
        float xC = sc.nextFloat();
        Triangulo x = new Triangulo(xA, xB, xC);

        logger.info("Digite as 3 medidas dos lados do tri�ngulo Y:");
        float yA = sc.nextFloat();
        float yB = sc.nextFloat();
        float yC = sc.nextFloat();
        Triangulo y = new Triangulo(yA, yB, yC);

        float areaX = x.calcularArea();
        float areaY = y.calcularAreaUsandoMetodos();

        logger.log(Level.INFO, "�rea do tri�ngulo X: {0}", areaX);
        logger.log(Level.INFO, "�rea do tri�ngulo Y: {0}", areaY);

        if (areaX > areaY) {
            logger.info("O tri�ngulo com a maior �rea � o tri�ngulo X.");
        } else if (areaY > areaX) {
            logger.info("O tri�ngulo com a maior �rea � o tri�ngulo Y.");
        } else {
            logger.info("Os tri�ngulos t�m �reas iguais.");
        }

        float perimetroX = x.calcularPerimetro();
        float perimetroY = y.calcularPerimetrUsandoMetodos();

        logger.log(Level.INFO, "Per�metro do tri�ngulo X: {0}", perimetroX);
        logger.log(Level.INFO, "Per�metro do tri�ngulo Y: {0}", perimetroY);

        sc.close();
    }
}
