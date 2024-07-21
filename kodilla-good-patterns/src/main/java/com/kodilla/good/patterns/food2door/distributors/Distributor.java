package com.kodilla.good.patterns.food2door.distributors;

import com.kodilla.good.patterns.food2door.Client;
import com.kodilla.good.patterns.food2door.Product;
import com.kodilla.good.patterns.food2door.Quantity;

public interface Distributor {

    boolean process(Client client, Product product, Quantity quantity);
    String distributorName();

}
