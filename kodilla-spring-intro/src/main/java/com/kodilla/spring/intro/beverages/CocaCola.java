package com.kodilla.spring.intro.beverages;

import com.kodilla.spring.intro.beverages.tastes.Sweet;

public class CocaCola implements Beverage {

    private final String NAME = "Coca-Cola";

    private Sweet sweet;

    public CocaCola() {
    }

    public CocaCola(Sweet sweet) {
        this.sweet = sweet;
    }

    @Override
    public String taste() {
        return sweet.takeSweet() + " " + NAME;
    }
}
