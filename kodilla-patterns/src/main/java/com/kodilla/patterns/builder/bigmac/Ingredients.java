package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    public static List<String> makeBunList(){
        List<String> list = new ArrayList<>();
        list.add("with sesame");
        list.add("without sesame");
      return list;
    }
    public static List<String> makeSauceList(){
        List<String> list = new ArrayList<>();
        list.add("standard");
        list.add("1000 wysp");
        list.add("barbecue");
      return list;
    }
    public static List<String> makeIngredientsList(){
        List<String> list = new ArrayList<>();
        list.add("sałata");
        list.add("cebula");
        list.add("bekon");
        list.add("ogórek");
        list.add("papryczki chilli");
        list.add("pieczarki");
        list.add("krewetki");
        list.add("ser");
      return list;
    }
}
