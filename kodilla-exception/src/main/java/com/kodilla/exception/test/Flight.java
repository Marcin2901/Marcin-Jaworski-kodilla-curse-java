package com.kodilla.exception.test;

import java.util.Objects;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getDepartureAirport(), flight.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport());
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
