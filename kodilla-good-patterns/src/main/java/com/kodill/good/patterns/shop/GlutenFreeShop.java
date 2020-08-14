package com.kodill.good.patterns.shop;

import com.kodill.good.patterns.Product.Product;

import java.util.ArrayList;

public class GlutenFreeShop extends Company implements InformationAboutShop, Ordering{


    public GlutenFreeShop(String companyName, String section, ArrayList<Products> products) {
        super(companyName, section, products);
    }


}
