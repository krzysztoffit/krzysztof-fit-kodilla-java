package com.kodilla.good.patterns.challenges;

public interface OrderRepository {

    void createOrder(Customer customer, Product product, DeliveryProvider deliveryProvider);
}
