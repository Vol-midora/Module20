package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args){
        Flight flight1 = new Flight("Kraków", "Warszawa");
        Flight flight2 = new Flight("Kraków", "Pcim");
        Flight flight3 = new Flight("Rybnik", "Wiedeń");

        FlightConnection fclooker = new FlightConnection();

        try{
            fclooker.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Thank you for using our services");
        }

        try{
            fclooker.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Thank you for using our services");
        }

        try{
            fclooker.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Thank you for using our services");
        }


    }
}
