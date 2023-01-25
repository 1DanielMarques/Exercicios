package DesignPatterns.decorator;

public class ProductDecorator implements Product {

    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public double getPrice() {
        return this.product.getPrice();
    }

    @Override
    public String getName() {
        return this.product.getName();
    }
}
