package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(final Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("New York", false);
        flights.put("London", true);
        flights.put("Paris", true);
        flights.put("Madrid", true);
        flights.put("Tokio", false);

        if (!flights.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException(flight.getDepartureAirport());
        }

        if (!flights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException(flight.getArrivalAirport());
        }

    }
}
