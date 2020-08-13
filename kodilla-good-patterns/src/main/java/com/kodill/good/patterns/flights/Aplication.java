package com.kodill.good.patterns.flights;

import java.io.IOException;

public class Aplication {
    public static void main(String[] args) throws IOException, FlyNotFoundException {

        try {
            Menu.menu();
        }
        catch(FlyNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
