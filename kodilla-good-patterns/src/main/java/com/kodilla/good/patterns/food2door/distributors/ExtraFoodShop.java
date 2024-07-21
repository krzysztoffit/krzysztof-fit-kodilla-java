package com.kodilla.good.patterns.food2door.distributors;

import com.kodilla.good.patterns.food2door.Client;
import com.kodilla.good.patterns.food2door.Product;
import com.kodilla.good.patterns.food2door.Quantity;

public class ExtraFoodShop implements Distributor {

    @Override
    public boolean process(Client client, Product product, Quantity quantity) {
        if (!client.getAddress().toLowerCase().contains("warszawa")) {
            System.out.println("This distributor delivers only in Warsaw!");
            return false;
        }
        return true;
    }

    @Override
    public String distributorName() {
        return "ExtraFoodShop";
    }
}
