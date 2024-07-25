package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String[] args) {
        Connections connections = new Connections();
        String from = "Gdańsk";
        String to = "Wrocław";
        SearchFlightsService service = new SearchFlightsService();

        System.out.println("Flights from " + from);
        service.searchFlightsFrom(connections.getFlightList(), from)
                        .forEach(System.out::println);

        System.out.println();
        System.out.println("Flights to " + to);
        service.searchFlightsTo(connections.getFlightList(), to)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Flights from " + from + " to " + to + " with transfer");
        service.searchFlightsWithTransfer(connections.getFlightList(), from, to)
                .forEach(System.out::println);

    }
}
