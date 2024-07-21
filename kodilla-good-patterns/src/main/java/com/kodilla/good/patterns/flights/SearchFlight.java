package com.kodilla.good.patterns.flights;

public class SearchFlight {

    private final Connections connections;
    private final String city;
    private final SearchFlightService searchFlightService;

    public SearchFlight(Connections connections, String city, SearchFlightService searchFlightService) {
        this.connections = connections;
        this.city = city;
        this.searchFlightService = searchFlightService;
    }

    public Connections getConnections() {
        return connections;
    }

    public String getCity() {
        return city;
    }

    public SearchFlightService getSearchFlightService() {
        return searchFlightService;
    }
}
