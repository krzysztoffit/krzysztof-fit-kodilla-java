package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Customer customer = new Customer(
                "janko",
                "Jan",
                "Nowak",
                "01-200 Warszawa, ul. Konwaliowa 23/4",
                "jan.nowak@mail.com",
                123987456L
        );

        Product product = new Product(
                "Telewizor",
                BigDecimal.valueOf(1500L)
        );

        DeliveryProvider deliveryProvider = new DeliveryProvider("DHL");


        return new OrderRequest(customer, product, deliveryProvider);
    }
}
