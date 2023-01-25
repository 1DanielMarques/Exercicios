package DesignPatterns.decorator;

public class TShirt implements Product {

    private double price = 10.0;
    private String name = "TShirt";

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
