package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class America implements Continent {

    public List<Country> getCountriesList() {
        List<Country> countriesList = new ArrayList<>();
        countriesList.add(new Country("USA", new BigDecimal("150280121")));
        countriesList.add(new Country("Canada", new BigDecimal("149500401")));
        countriesList.add(new Country("Argentina", new BigDecimal("86021211")));
        countriesList.add(new Country("Brazil", new BigDecimal("90001004")));

        return new ArrayList<>(countriesList);
    }
}
