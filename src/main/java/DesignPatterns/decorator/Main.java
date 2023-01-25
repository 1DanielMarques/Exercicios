package DesignPatterns.decorator;

public class Main {
    public static void main(String[] args) {

        Product tshirt = new TShirt();
        Product decoratedTShirt = new ProductDecorator(tshirt);
        Product stamped = new StampedTshirt(tshirt);
        Product stampedTwice = new StampedTshirt(stamped);
        System.out.println(tshirt.getName() + " " + tshirt.getPrice());
        System.out.println(decoratedTShirt.getName() + " " + decoratedTShirt.getPrice());
        System.out.println(stamped.getName() + " " + stamped.getPrice());
        System.out.println(stampedTwice.getName() + " " + stampedTwice.getPrice());



    }
}
