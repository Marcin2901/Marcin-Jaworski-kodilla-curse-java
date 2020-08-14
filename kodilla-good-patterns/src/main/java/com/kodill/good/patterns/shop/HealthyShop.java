package com.kodill.good.patterns.shop;

import com.kodill.good.patterns.Product.Product;

import java.util.ArrayList;

public class HealthyShop extends Company implements InformationAboutShop, Ordering{


    public HealthyShop(String companyName, String section, ArrayList<Products> products) {
        super(companyName, section, products);
    }
}
