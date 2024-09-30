package br.com.ifsc.aula03.atividade04;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade04 {
    private static final Logger logger = Logger.getLogger(Atividade04.class.getName());

    public static void atividade04() {
        Scanner sc = new Scanner(System.in);

        logger.info("Digite as 3 medidas dos lados do triângulo X:");
        float xA = sc.nextFloat();
        float xB = sc.nextFloat();
        float xC = sc.nextFloat();
        Triangulo x = new Triangulo(xA, xB, xC);

        logger.info("Digite as 3 medidas dos lados do triângulo Y:");
        float yA = sc.nextFloat();
        float yB = sc.nextFloat();
        float yC = sc.nextFloat();
        Triangulo y = new Triangulo(yA, yB, yC);

        float areaX = x.calcularArea();
        float areaY = y.calcularAreaUsandoMetodos();

        logger.log(Level.INFO, "Área do triângulo X: {0}", areaX);
        logger.log(Level.INFO, "Área do triângulo Y: {0}", areaY);

        if (areaX > areaY) {
            logger.info("O triângulo com a maior área é o triângulo X.");
        } else if (areaY > areaX) {
            logger.info("O triângulo com a maior área é o triângulo Y.");
        } else {
            logger.info("Os triângulos têm áreas iguais.");
        }

        float perimetroX = x.calcularPerimetro();
        float perimetroY = y.calcularPerimetrUsandoMetodos();

        logger.log(Level.INFO, "Perímetro do triângulo X: {0}", perimetroX);
        logger.log(Level.INFO, "Perímetro do triângulo Y: {0}", perimetroY);

        sc.close();
    }
}
