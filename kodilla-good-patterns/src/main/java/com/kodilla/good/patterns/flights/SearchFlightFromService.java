package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlightFromService implements SearchFlightService {

    @Override
    public List<Flight> searchFlight(Connections connections, String city) {
        return connections.getFlightList().stream()
                .filter(f -> city.equalsIgnoreCase(f.getFrom()))
                .collect(Collectors.toList());
    }

}
