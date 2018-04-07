package com.kodilla.exception.test;

import java.util.*;
import java.util.stream.Collectors;

public class FlightConnection {

    public FlightConnection() {

    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> FlightMap = new HashMap<>();
        FlightMap.put("Warszawa", true);
        FlightMap.put("Kraków", true);
        FlightMap.put("Wrocław", true);
        FlightMap.put("Szczecin", true);
        FlightMap.put("Katowice", true);
        FlightMap.put("Lublin", true);
        FlightMap.put("Torun", false);
        FlightMap.put("Gdansk", false);
        FlightMap.put("Pcim", false);
        FlightMap.put("Kazimierz", false);

        if (!FlightMap.entrySet().stream().map(n -> n.getKey()).collect(Collectors.toList()).contains(flight.getArrivalAirport()) ||
                !FlightMap.entrySet().stream().map(n -> n.getKey()).collect(Collectors.toList()).contains(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Unknown arrival or destination");
        }

        List<String> interimList = FlightMap.entrySet().stream()
                .filter(n->n.getValue())
                .map(n->n.getKey())
                .collect(Collectors.toList());

        if (interimList.contains(flight.getDepartureAirport()) && interimList.contains(flight.getArrivalAirport())) {
            System.out.println("Connection found");
        } else {
            System.out.println("Connection unavailable");
        }


    }
}
