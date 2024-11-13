package br.com.ifsc.aula06;

public class Product {

    private String name;

    private Double price;

    private Integer quantity;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    private Double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(Integer quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(Integer quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
