package br.com.ifsc.aula05;

public class FrutaMain {
    public static void main(String[] args) {
        Fruta banana = new Fruta("Tropical", "Banana", 100);
        banana.vender(20);
        banana.vender(90);
    }
}
