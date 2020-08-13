package com.kodill.good.patterns.flights;

public class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }
    public String getDitals(){
        return "Flight from " + this.departure + " to " + this.arrival;
    }

    @Override
    public String toString() {
        return "Flight from " + this.departure + " to " + this.arrival;
    }
}
