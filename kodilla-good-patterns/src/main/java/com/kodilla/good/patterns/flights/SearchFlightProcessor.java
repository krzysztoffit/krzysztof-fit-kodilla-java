package com.kodilla.good.patterns.flights;

import java.util.List;

public class SearchFlightProcessor {

    public List<Flight> findFlights(SearchFlight flightsRetriever) {
        Connections connections = flightsRetriever.getConnections();
        String city = flightsRetriever.getCity();
        SearchFlightService searchFlightService = flightsRetriever.getSearchFlightService();
        return searchFlightService.searchFlight(connections, city);
    }
}
