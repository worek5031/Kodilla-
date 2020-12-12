package com.kodilla.patterns.strategy;

public class Customer {

    private final String name;
    protected BuyPredictor buyPredictor;

    public String predict() {
        return buyPredictor.predictWhatToBuy();
    }

    public void setBuyingStrategy(BuyPredictor buyPredictor) {
        this.buyPredictor = buyPredictor;
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
