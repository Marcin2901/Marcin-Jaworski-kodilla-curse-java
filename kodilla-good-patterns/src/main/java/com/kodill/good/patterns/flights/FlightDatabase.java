package com.kodill.good.patterns.flights;

import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        this.flights.add(new Flight("Gdańsk", "Wrocław"));
        this.flights.add(new Flight("Wrocław", "Warszawa"));
        this.flights.add(new Flight("Warszawa", "Toruń"));
        this.flights.add(new Flight("Toruń", "Poznań"));
        this.flights.add(new Flight("Poznań", "Kielce"));
        this.flights.add(new Flight("Kielce", "Poznań"));
        this.flights.add(new Flight("Szczecin", "Kraków"));
        this.flights.add(new Flight("Poznań", "Gdańsk"));
        this.flights.add(new Flight("Kraków", "Warszawa"));
        this.flights.add(new Flight("Warszawa", "Kielce"));

    }
    public boolean checkIfFLyExist(Flight flight){
        boolean isExist = false;
        for(Flight lot : flights){
            if(flight.departure.equals(lot.departure)&&flight.arrival.equals(lot.arrival)) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    public ArrayList<Flight> getFlightsFromCity(String city) throws FlyNotFoundException{

        ArrayList<Flight> lista = new ArrayList<>();
        for(Flight lot : flights){
            if(city.equals(lot.departure))
                lista.add(lot);
        }
        if(lista.size()==0)
            throw new FlyNotFoundException();
        return lista;
    }

    public ArrayList<Flight> getFlightsToCity(String city) throws FlyNotFoundException{

        ArrayList<Flight> lista = new ArrayList<>();
        for(Flight lot : flights){
            if(city.equals(lot.arrival))
                lista.add(lot);
        }
        if(lista.size()==0)
            throw new FlyNotFoundException();
        return lista;
    }

    public ArrayList<?> getFlights(String start, String end) throws FlyNotFoundException {
        if(checkIfFLyExist(new Flight(start,end))) {
            ArrayList<Flight> lista = new ArrayList<Flight>();
            lista.add(new Flight(start,end));
            return lista;
        }
        ArrayList<Flight> starting = getFlightsFromCity(start);
        ArrayList<Flight> ending = getFlightsToCity(end);
        ArrayList<ChangeFly> result = new ArrayList<>();

        for(Flight first : starting){
            for(Flight second : ending){
                if(first.arrival.equals(second.departure)) {
                    result.add(new ChangeFly(first,second));
                }
            }
        }
        if(result.size()==0)
            throw new FlyNotFoundException();
        return result;
    }
}
