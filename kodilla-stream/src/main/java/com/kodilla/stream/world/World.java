package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public List<Continent> getContinentsList() {
        List<Continent> continentsList = new ArrayList<>();
        continentsList.add(new Europe());
        continentsList.add(new Asia());
        continentsList.add(new America());
        return continentsList;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal worldPeopleQuantity = getContinentsList().stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return worldPeopleQuantity;
    }
}
