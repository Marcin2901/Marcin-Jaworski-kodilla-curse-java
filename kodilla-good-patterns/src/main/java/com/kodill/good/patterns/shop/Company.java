package com.kodill.good.patterns.shop;





import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Company {
    String companyName;
    String section;
    ArrayList<Products> products;

    public Company(String companyName, String section, ArrayList<Products> products) {
        this.companyName = companyName;
        this.section = section;
        this.products = products;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getSection() {
        return section;
    }

    public void getInform() {
        System.out.println("Company Name: " + this.companyName + "\nCompany section: "
                + this.section + " \n" + "products that the company sells:");
        for (Products product : products) {
            System.out.println(product);
        }
    }
    public boolean process(Products product) {
      ArrayList<?> lista = (ArrayList<?>) products.stream()
               .map(s -> s.getProductName())
               .filter(s -> s.equals(product.getProductName()))
                .collect(Collectors.toList());

        if(!lista.isEmpty())
        return true;
        else
            return false;
    }
}
