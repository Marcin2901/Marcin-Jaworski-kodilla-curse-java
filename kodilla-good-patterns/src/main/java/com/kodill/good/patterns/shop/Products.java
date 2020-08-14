package com.kodill.good.patterns.shop;

public class Products {
    String productName;
    int productQuanity;

    public Products(String productName, int productQuanity) {
        this.productName = productName;
        this.productQuanity = productQuanity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuanity() {
        return productQuanity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productQuanity=" + productQuanity +
                '}';
    }
}
