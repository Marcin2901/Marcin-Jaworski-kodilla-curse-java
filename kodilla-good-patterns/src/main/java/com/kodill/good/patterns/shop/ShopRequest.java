package com.kodill.good.patterns.shop;

import java.util.ArrayList;

public class ShopRequest {
    public void request() {
        Products products = new Products("Widelec", 10);
        Products products1 = new Products("Nóż", 10);

        ArrayList<Products> lista = new ArrayList<>();
        lista.add(products);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "Food", lista);

        extraFoodShop.getInform();
        System.out.println();
        System.out.println("Wynik zamówienia widelcy:");
        System.out.println(extraFoodShop.process(products));
        System.out.println("Wynik zamówienia noży:");
        System.out.println(extraFoodShop.process(products1));
    }
}
