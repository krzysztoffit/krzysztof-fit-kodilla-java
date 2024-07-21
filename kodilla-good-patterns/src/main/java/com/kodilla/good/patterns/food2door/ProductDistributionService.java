package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.distributors.Distributor;

public class ProductDistributionService implements DistributionService {

    @Override
    public boolean distribution(Distributor distributor, Client client, Quantity quantity, Product product) {
        System.out.println("Distributor: " + distributor.distributorName());
        System.out.println("Quantity of the product: " + quantity.getAmount() + " " + quantity.getUnit());
        System.out.println("Product: " + product.getName());

        return distributor.process(client, product, quantity);
    }
}
