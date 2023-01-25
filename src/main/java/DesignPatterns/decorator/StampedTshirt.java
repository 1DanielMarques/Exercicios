package DesignPatterns.decorator;

public class StampedTshirt extends ProductDecorator {
    public StampedTshirt(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;

    }

    @Override
    public String getName() {
        return super.getName() + " Stamped";
    }
}
