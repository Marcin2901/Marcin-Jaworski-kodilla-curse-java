package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightData  {
    public  static HashMap<Flight,Boolean> makeDateOfFlight() {
        HashMap<Flight, Boolean> flightList = new HashMap<>();


        //Flight DataBase
       flightList.put(new Flight("Warsow", "Berlin"),true);
        flightList.put(new Flight("Mexiko", "Hollywod"),false);
        flightList.put(new Flight("Moskwa", "Rome"),true);
        flightList.put(new Flight("Madrit", "Berlin"),false);
        flightList.put(new Flight("Warsow", "Madrit"),true);
        flightList.put(new Flight("Kielce", "Warsow"),false);
        flightList.put(new Flight("Kanada", "Paris"),true);
        flightList.put(new Flight("Warsow", "Brasilia"),false);
        flightList.put(new Flight("Moskwa", "Wrocław"),true);
        flightList.put(new Flight("Rome", "Berlin"),false);

        return  flightList;
    }

}
