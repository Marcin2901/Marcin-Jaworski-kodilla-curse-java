package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{
    public boolean order(final User user, LocalDateTime dayOfOrder, Product product){
        System.out.println("Product ordered by: " + user.getName() + " " + user.getSurname()
        + " in: " + dayOfOrder.toString()+  " \n Order ditails: \n" + "Product Name: " + product.getProductName() + "\n"
        + "Product Price: " + product.getProductPrice());

        return true;
    }


}
