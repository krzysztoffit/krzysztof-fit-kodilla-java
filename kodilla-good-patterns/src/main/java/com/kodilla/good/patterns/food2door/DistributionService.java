package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.distributors.Distributor;

public interface DistributionService {

     boolean distribution(Distributor distributor, Client client, Quantity quantity, Product product);

}
