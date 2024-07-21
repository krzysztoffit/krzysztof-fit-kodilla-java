package com.kodilla.good.patterns.food2door;

public class Quantity {

    private final String unit;
    private final Double amount;

    public Quantity(String unit, Double amount) {
        this.unit = unit;
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public Double getAmount() {
        return amount;
    }
}
