package DesignPatterns.strategy;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;

    public CreditCardStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card");
    }
}
