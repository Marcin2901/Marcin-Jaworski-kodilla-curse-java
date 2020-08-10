package com.kodilla.exception.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightSearch {
    public boolean findFilght(Flight flight) throws RouteNotFoundException{
        FlightData data = new FlightData();

        Map<Flight, Boolean> flights = new HashMap<>();
        flights = FlightData.makeDateOfFlight();

        try{
            for(int i=0; i<flights.size(); i++){
                if(flights.containsKey(flight))
                    return flights.get(flight);
                return flights.get(flight);
            }
        }
        catch (Exception e){
            throw new RouteNotFoundException();

        }


        return false;
    }


    public static void main(String[] args) throws RouteNotFoundException {
        FlightSearch flightSearch = new FlightSearch();
        try {
            System.out.println(flightSearch.findFilght(new Flight("Warsow", "Berlin")));
            System.out.println(flightSearch.findFilght(new Flight("Warso", "Berlin")));

        } catch (RouteNotFoundException e) {
            System.out.println("Exception: Danego lotniska nie ma w bazie danych");
        }


    }
}
