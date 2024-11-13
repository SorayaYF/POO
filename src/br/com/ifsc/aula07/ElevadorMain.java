package br.com.ifsc.aula07;

public class ElevadorMain {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(5, 10, 0);

        System.out.println(elevador.mostrar());

        elevador.entra(3);
        System.out.println(elevador.mostrar());

        elevador.sobe();
        System.out.println(elevador.mostrar());

        elevador.sobe(5);
        System.out.println(elevador.mostrar());

        elevador.desce();
        System.out.println(elevador.mostrar());

        elevador.sai(2);
        System.out.println(elevador.mostrar());

        elevador.sai();
        System.out.println(elevador.mostrar());
    }
}