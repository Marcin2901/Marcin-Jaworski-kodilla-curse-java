package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;

public class OrderRequestMake {
    public OrderRequest bay(){

        User user = new User("Marcin", "Jaworski", "jamarcin2901@wp.pl");
        LocalDateTime dayOfOrder = LocalDateTime.of(2020,8,13,12,0);
        Product product = new Product("Fortepian",20000);

        return new OrderRequest(user,dayOfOrder,product);
    }
}
