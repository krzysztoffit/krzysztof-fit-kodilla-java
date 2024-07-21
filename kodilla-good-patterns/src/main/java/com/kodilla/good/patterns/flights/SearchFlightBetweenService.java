package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchFlightBetweenService implements SearchFlightService {

    @Override
    public List<Flight> searchFlight(Connections connections, String city) {
        return connections.getFlightList().stream()
                .collect(Collectors.filtering(
                        (f -> (city.equalsIgnoreCase
                                (
                                        f.getFrom()) == city.equalsIgnoreCase(f.getTo())
                        )),
                        Collectors.toList()));
//

    }

}
