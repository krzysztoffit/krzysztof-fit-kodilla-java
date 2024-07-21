package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.distributors.Distributor;

public class DistributionRequest {

    private final Client client;
    private final Product product;
    private final Distributor distributor;
    private final Quantity quantity;

    public DistributionRequest(
            Client client,
            Product product,
            Distributor distributor,
            Quantity quantity
    ) {
        this.client = client;
        this.product = product;
        this.distributor = distributor;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
