package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;

    public Country(String nameOfCountry, BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
