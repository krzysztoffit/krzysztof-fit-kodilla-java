package com.kodilla.good.patterns.food2door.distributors;

import com.kodilla.good.patterns.food2door.Client;
import com.kodilla.good.patterns.food2door.Product;
import com.kodilla.good.patterns.food2door.Quantity;

public class GlutenFreeShop implements Distributor {

    private final boolean confirm;

    public GlutenFreeShop(boolean confirm) {
        this.confirm = confirm;
    }

    @Override
    public boolean process(Client client, Product product, Quantity quantity) {
        if (confirm) {
            System.out.println("Distributor is ready for delivery.");
            return true;
        } else {
            System.out.println("This distributor don't send product, because it's not confirmed.");
            return false;
        }
    }

    @Override
    public String distributorName() {
        return "GlutenFreeShop";
    }
}
