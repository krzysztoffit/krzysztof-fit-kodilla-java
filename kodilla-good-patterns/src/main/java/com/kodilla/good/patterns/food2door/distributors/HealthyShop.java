package com.kodilla.good.patterns.food2door.distributors;

import com.kodilla.good.patterns.food2door.Client;
import com.kodilla.good.patterns.food2door.Product;
import com.kodilla.good.patterns.food2door.Quantity;

public class HealthyShop implements Distributor {

    @Override
    public boolean process(Client client, Product product, Quantity quantity) {
        if (quantity.getAmount() < 50) {
            System.out.println("This distributor don't sell this amount of product!");
            return false;
        }
        return true;
    }

    @Override
    public String distributorName() {
        return "HealthyShop";
    }
}
