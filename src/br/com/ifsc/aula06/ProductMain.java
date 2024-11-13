package br.com.ifsc.aula06;

public class ProductMain {
    public static void main(String[] args) {
        Product productTv = new Product("TV", 900.00, 10);
        Product productMouse = new Product("Mouse", 50.00, 20);
        Product productTablet = new Product("Tablet", 350.00, 30);
        Product productNotebook = new Product("Notebook", 2500.00);

        productTv.addProducts(5);
        productMouse.removeProducts(10);
        productTablet.addProducts(10);

        System.out.println(productTv);
        System.out.println(productMouse);
        System.out.println(productTablet);
        System.out.println(productNotebook);
    }
}
