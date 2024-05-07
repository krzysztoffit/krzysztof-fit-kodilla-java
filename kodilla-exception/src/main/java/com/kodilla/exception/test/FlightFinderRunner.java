package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Rome", "Tokio"));
            System.out.println("OK, you can go.");
        } catch (RouteNotFoundException e) {
            System.out.println("You can't use this airport: " + e.getMessage() + ", because it doesn't exist!");
        }

    }
}
