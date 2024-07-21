package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {
        SearchFlightProcessor searchFlightProcessor = new SearchFlightProcessor();
        SearchFlightRetriever searchFlightRetriever = new SearchFlightRetriever();
        SearchFlight searchFlight = searchFlightRetriever.flightRetrieve();

        searchFlightProcessor.findFlights(searchFlight)
                .forEach(System.out::println);
    }
}
