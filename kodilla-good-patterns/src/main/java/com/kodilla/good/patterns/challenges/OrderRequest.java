package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private final Customer customer;
    private final Product product;
    private final DeliveryProvider deliveryProvider;

    public OrderRequest(
            final Customer customer,
            final Product product,
            final DeliveryProvider deliveryProvider
    ) {
        this.customer = customer;
        this.product = product;
        this.deliveryProvider = deliveryProvider;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public DeliveryProvider getDeliveryProvider() {
        return deliveryProvider;
    }
}
