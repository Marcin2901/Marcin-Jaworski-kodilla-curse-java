package com.kodill.good.patterns.flights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static javafx.application.Platform.exit;

public class Menu {
    public static void menu() throws IOException, FlyNotFoundException {

        String city1;
        String city2;

        System.out.println("WYSZUKIWARKA LOTÓW");
        System.out.println("1.Wyszukaj loty z podanego miasta");
        System.out.println("2.Wyszukaj loty do podanego miasta");
        System.out.println("3.Sprawdź czy podany lot istnieje");
        System.out.println("4.Wyszukaj loty z miasta do miasta - z przesiadką");
        System.out.print("WYBÓR: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        FlightDatabase flightDatabase = new FlightDatabase();
        int choice = Integer.parseInt(reader.readLine());
        if(choice>4||choice<1) {
            exit();
            System.out.println("Błąd wyboru");
        }
        switch (choice){
            case 1: { System.out.print("Podaj miasto startowe: ");
                System.out.println( flightDatabase.getFlightsFromCity(reader2.readLine()));
                break;
            }
            case 2:{
                System.out.print("Podaj miasto końcowe: ");
                System.out.println(flightDatabase.getFlightsToCity(reader2.readLine()));

                break;}
            case 3:{
                System.out.print("Podaj miasto startowe: ");
                city1 = reader2.readLine();
                System.out.print("Podaj miasto końcowe: ");
                city2 = reader2.readLine();
                System.out.println(flightDatabase.checkIfFLyExist(new Flight(city1,city2)));
                break;
            }
            case 4:{
                System.out.print("Podaj miasto startowe: ");
                city1 = reader2.readLine();
                System.out.print("Podaj miasto końcowe: ");
                city2 = reader2.readLine();
                System.out.println( flightDatabase.getFlights(city1,city2));
                break;}
        }
    }
}
