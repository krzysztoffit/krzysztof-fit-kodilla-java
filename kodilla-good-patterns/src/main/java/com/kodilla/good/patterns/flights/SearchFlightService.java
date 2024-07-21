package com.kodilla.good.patterns.flights;

import java.util.List;

public interface SearchFlightService {

    List<Flight> searchFlight(Connections connections, String city);

}
