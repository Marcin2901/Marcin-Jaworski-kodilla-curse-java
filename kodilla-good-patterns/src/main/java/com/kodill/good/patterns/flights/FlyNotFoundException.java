package com.kodill.good.patterns.flights;

public class FlyNotFoundException extends Exception{
    public String getMessage(){
        return "Nie znaleziono lotu";
    }
}
