package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer liczba : numbers){
            if(liczba%2==0)
                list.add(liczba);
        }
        return list;
    }
}
