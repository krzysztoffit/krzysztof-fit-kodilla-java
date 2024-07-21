package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.distributors.Distributor;
import com.kodilla.good.patterns.food2door.distributors.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.distributors.HealthyShop;

import java.math.BigDecimal;

public class DistributionRequestRetriever {

    public DistributionRequest retriever() {
        Client client = new Client(
                "kowal",
                "Piotr",
                "Kowalski",
                "kowal@poland.com",
                "11-100 Olsztyn, ul. Przewodnia 1",
                89761212121L
        );

        Product product = new Product(
                "Apple",
                BigDecimal.valueOf(4.90)
        );

        Distributor distributor = new GlutenFreeShop(false);

        Quantity quantity = new Quantity(
                "kg",
                25.0
        );

        return new DistributionRequest(client, product, distributor, quantity);
    }
}
