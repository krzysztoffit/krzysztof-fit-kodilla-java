package com.kodilla.good.patterns.flights;

public class SearchFlightRetriever {



    public SearchFlight flightRetrieve() {
        Connections connections = new Connections();
        String city = "Warszawa";
        SearchFlightService searchFlightService = new SearchFlightBetweenService();

        return new SearchFlight(connections, city, searchFlightService);
    }
}
