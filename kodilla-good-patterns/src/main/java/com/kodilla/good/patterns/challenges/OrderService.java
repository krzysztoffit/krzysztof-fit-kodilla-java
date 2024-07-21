package com.kodilla.good.patterns.challenges;

public interface OrderService {

    boolean order(Customer customer, Product product, DeliveryProvider deliveryProvider);
}
