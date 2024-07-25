package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class SearchFlightsService {

    public List<Flight> searchFlightsFrom(List<Flight> flightsList, String city) {
        return flightsList.stream()
                .filter(f -> city.equals(f.from()))
                .toList();
    }

    public List<Flight> searchFlightsTo(List<Flight> flightsList, String city) {
        return flightsList.stream()
                .filter(f -> city.equals(f.to()))
                .toList();
    }

    public List<List<Flight>> searchFlightsWithTransfer(List<Flight> flightsList, String fromCity, String toCity) {
        List<Flight> flightsTo = searchFlightsTo(flightsList, toCity);
        List<Flight> flightsFrom = searchFlightsFrom(flightsList, fromCity);

        List<Flight> flightsToTransferCity = flightsFrom.stream()
                .filter(to -> flightsTo.stream()
                        .anyMatch(from -> from.from().equals(to.to())))
                .toList();

        List<Flight> flightsFromTransferCity = flightsTo.stream()
                .filter(from -> flightsFrom.stream()
                        .anyMatch(to -> to.to().equals(from.from())))
                .toList();

        return getListsOfFlightsWitTransfer(flightsToTransferCity, flightsFromTransferCity);
    }

    private static List<List<Flight>> getListsOfFlightsWitTransfer(List<Flight> flightsToTransferCity, List<Flight> flightsFromTransferCity) {
        List<List<Flight>> flightsWithTransfer = new ArrayList<>();
        for (Flight flight : flightsToTransferCity) {
            for (Flight value : flightsFromTransferCity) {
                if (flight.to().equals(value.from())) {
                    List<Flight> temporaryList = new ArrayList<>();
                    temporaryList.add(flight);
                    temporaryList.add(value);
                    flightsWithTransfer.add(temporaryList);
                }
            }
        }
        return flightsWithTransfer;
    }
}
