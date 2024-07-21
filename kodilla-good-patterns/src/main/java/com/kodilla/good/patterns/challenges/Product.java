package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final BigDecimal price;

    public Product(final String name, final BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
