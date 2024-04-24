package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Europe implements Continent {

    public List<Country> getCountriesList() {
        List<Country> countriesList = new ArrayList<>();
        countriesList.add(new Country("Poland", new BigDecimal("38280120")));
        countriesList.add(new Country("Germany", new BigDecimal("59500401")));
        countriesList.add(new Country("France", new BigDecimal("52021211")));
        countriesList.add(new Country("Spain", new BigDecimal("40001004")));

        return new ArrayList<>(countriesList);
    }
}
