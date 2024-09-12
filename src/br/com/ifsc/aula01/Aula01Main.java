package br.com.ifsc.aula01;

import br.com.ifsc.aula01.atividade01.Triangulo;
import br.com.ifsc.aula01.atividade02.Quadrado;
import br.com.ifsc.aula01.atividade03.parte1.Figura3D;
import br.com.ifsc.aula01.atividade03.parte1.Geometria;
import br.com.ifsc.aula01.atividade03.parte1.Poligono;
import br.com.ifsc.aula01.atividade03.parte2.Funcionario;
import br.com.ifsc.aula01.atividade03.parte2.Gerente;
import br.com.ifsc.aula01.atividade03.parte2.Pessoa;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula01Main {

    private static final Logger logger = Logger.getLogger(Aula01Main.class.getName());

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10, 5);
        logger.log(Level.INFO, triangulo.toString());
        logger.log(Level.INFO, "Área: {0}", triangulo.calcularArea());
        logger.log(Level.INFO, "Perímetro: {0}", triangulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado(5);
        logger.log(Level.INFO, quadrado.toString());
        logger.log(Level.INFO, "Área: {0}", quadrado.calcularArea());
        logger.log(Level.INFO, "Perímetro: {0}", quadrado.calcularPerimetro());

        Geometria geometria = new Geometria("Geometria Básica");
        geometria.adicionarFiguraPlana(quadrado);
        geometria.adicionarFiguraPlana(triangulo);
        logger.log(Level.INFO, geometria.toString());
        logger.log(Level.INFO, "Área total: {0}", geometria.calcularAreaTotal());
        geometria.listarFiguras();

        Figura3D cubo = new Figura3D(quadrado, 4);
        Figura3D piramide = new Figura3D(triangulo, 6);
        logger.log(Level.INFO, cubo.toString());
        logger.log(Level.INFO, "Volume do cubo: {0}", cubo.calcularVolume());
        logger.log(Level.INFO, "Área da superfície do cubo: {0}", cubo.calcularAreaSuperficie());
        logger.log(Level.INFO, piramide.toString());
        logger.log(Level.INFO, "Área da superfície da pirâmide: {0}", piramide.calcularAreaSuperficie());
        logger.log(Level.INFO, "Volume da pirâmide: {0}", piramide.calcularVolume());

        Poligono hexagono = new Poligono(6, 3);
        logger.log(Level.INFO, hexagono.toString());
        logger.log(Level.INFO, "Área do hexágono: {0}", hexagono.calcularArea());
        logger.log(Level.INFO, "Perímetro do hexágono: {0}", hexagono.calcularPerimetro());

        Pessoa pessoa1 = new Pessoa("João");
        Pessoa pessoa2 = new Pessoa("Maria");
        Pessoa pessoa3 = new Pessoa("José");

        pessoa1.falar();
        pessoa2.andar();
        pessoa3.comer();

        Funcionario funcionario1 = new Funcionario("Pedro", 3000.0, "Desenvolvedor");
        Funcionario funcionario2 = new Funcionario("Ana", 4000.0, "Analista");
        Funcionario funcionario3 = new Funcionario("Marta", 5000.0, "Scrum Master");

        funcionario1.trabalhar();
        funcionario2.receberSalario();
        funcionario3.baterPonto();

        Gerente gerente1 = new Gerente("Carlos", 7000.0, "Gerente de TI", "TI", 10);
        Gerente gerente2 = new Gerente("Sofia", 8000.0, "Gerente de RH", "RH", 20);
        Gerente gerente3 = new Gerente("Lucas", 9000.0, "Gerente de Projetos", "Projetos", 30);

        gerente1.gerenciarEquipe();
        gerente2.aprovarProjeto();
        gerente3.darFeedback();
    }

}
