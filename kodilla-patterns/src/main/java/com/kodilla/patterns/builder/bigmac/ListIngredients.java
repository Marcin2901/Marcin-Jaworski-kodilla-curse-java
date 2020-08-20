package com.kodilla.patterns.builder.bigmac;

import java.util.List;

public class ListIngredients {
    public static  List<String> bunIngredients;
    public static  List<String> sauceIngredients;
    public static  List<String> possibleIngredients;


    public static  List<String> makeListOfBun() {
          return bunIngredients = Ingredients.makeBunList();
    }
    public static  List<String> makeListOfSauce() {
          return sauceIngredients = Ingredients.makeSauceList();

    }
    public static  List<String> makeListOfIngredients() {
          return possibleIngredients = Ingredients.makeIngredientsList();
    }

}
