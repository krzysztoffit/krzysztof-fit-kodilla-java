package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Connections {

    public List<Flight> getFlightList() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Warszawa", "Poznań"));
        flights.add(new Flight("Warszawa", "Szymany"));
        flights.add(new Flight("Gdańsk", "Szymany"));
        flights.add(new Flight("Gdańsk", "Poznań"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Wrocław", "Warszawa"));
        flights.add(new Flight("Poznań", "Warszawa"));
        flights.add(new Flight("Szymany", "Warszawa"));
        flights.add(new Flight("Szymany", "Gdańsk"));
        flights.add(new Flight("Poznań", "Gdańsk"));
        flights.add(new Flight("Szymany", "Wrocław"));
        flights.add(new Flight("Poznań", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Szczecin"));
        flights.add(new Flight("Gdańsk", "Bydgoszcz"));
        flights.add(new Flight("Rzeszów", "Wrocław"));
        flights.add(new Flight("Łódź", "Wrocław"));

        return flights;
    }

}
