package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Asia implements Continent {

    public List<Country> getCountriesList() {
        List<Country> countriesList = new ArrayList<>();
        countriesList.add(new Country("China", new BigDecimal("1138280120")));
        countriesList.add(new Country("Japan", new BigDecimal("39500401")));
        countriesList.add(new Country("South Korea", new BigDecimal("112021211")));
        countriesList.add(new Country("Wietnam", new BigDecimal("140001004")));

        return new ArrayList<>(countriesList);
    }
}
