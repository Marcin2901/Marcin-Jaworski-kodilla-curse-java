package com.kodill.good.patterns.shop;

import com.kodill.good.patterns.Product.Product;

import java.util.ArrayList;

public class ExtraFoodShop extends Company implements InformationAboutShop , Ordering{


    public ExtraFoodShop(String companyName, String section, ArrayList<Products> products) {
        super(companyName, section, products);
    }
}
