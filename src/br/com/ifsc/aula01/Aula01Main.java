package br.com.ifsc.aula01;

import br.com.ifsc.aula01.atividadeI.Triangulo;
import br.com.ifsc.aula01.atividadeII.Quadrado;
import br.com.ifsc.aula01.atividadeIII.parte1.Figura3D;
import br.com.ifsc.aula01.atividadeIII.parte1.Geometria;
import br.com.ifsc.aula01.atividadeIII.parte1.Poligono;
import br.com.ifsc.aula01.atividadeIII.parte2.Funcionario;
import br.com.ifsc.aula01.atividadeIII.parte2.Gerente;
import br.com.ifsc.aula01.atividadeIII.parte2.Pessoa;

public class Aula01Main {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10, 5);
        System.out.println(triangulo);
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado);
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        Geometria geometria = new Geometria("Geometria Básica");
        geometria.adicionarFiguraPlana(quadrado);
        geometria.adicionarFiguraPlana(triangulo);
        System.out.println(geometria);
        System.out.println("Área total: " + geometria.calcularAreaTotal());
        geometria.listarFiguras();

        Figura3D cubo = new Figura3D(quadrado, 4);
        Figura3D piramide = new Figura3D(triangulo, 6);
        System.out.println(cubo);
        System.out.println("Volume do cubo: " + cubo.calcularVolume());
        System.out.println("Área da superfície do cubo: " + cubo.calcularAreaSuperficie());
        System.out.println(piramide);
        System.out.println("Área da superfície da pirâmide: " + piramide.calcularAreaSuperficie());
        System.out.println("Volume da pirâmide: " + piramide.calcularVolume());

        Poligono hexagono = new Poligono(6, 3);
        System.out.println(hexagono);
        System.out.println("Área do hexágono: " + hexagono.calcularArea());
        System.out.println("Perímetro do hexágono: " + hexagono.calcularPerimetro());

        Pessoa pessoa1 = new Pessoa("João", 25, "Rua A, 123", "123.456.789-00", "(48) 99999-0000");
        Pessoa pessoa2 = new Pessoa("Maria", 30, "Rua B, 456", "987.654.321-00", "(48) 98888-1111");

        pessoa1.falar();
        pessoa2.andar();

        Funcionario funcionario1 = new Funcionario("Pedro", 35, "Rua C, 789", "111.222.333-44", "(48) 97777-2222",
                3000.0, "Desenvolvedor", "12345", "TI", "01/01/2020");
        Funcionario funcionario2 = new Funcionario("Ana", 40, "Rua D, 101", "555.666.777-88", "(48) 96666-3333",
                4000.0, "Analista", "54321", "RH", "15/03/2019");

        funcionario1.trabalhar();
        funcionario2.receberSalario();

        Gerente gerente1 = new Gerente("Carlos", 45, "Rua E, 202", "999.888.777-66", "(48) 95555-4444",
                7000.0, "Gerente de TI", "67890", "TI", "10/05/2015", 1500.0, "TI", 10, 15, "Sênior");
        Gerente gerente2 = new Gerente("Sofia", 50, "Rua F, 303", "111.222.333-44", "(48) 94444-5555",
                8000.0, "Gerente de RH", "98765", "RH", "20/07/2010", 2000.0, "RH", 15, 20, "Sênior");

        gerente1.gerenciarEquipe();
        gerente2.aprovarProjeto();
    }

}
