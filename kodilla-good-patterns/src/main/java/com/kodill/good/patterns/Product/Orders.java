package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;

public class Orders {
    private User user;
    private LocalDateTime dayOfOrder;
    private Product product;

    public Orders(User user, LocalDateTime dayOfOrder, Product product) {
        this.user = user;
        this.dayOfOrder = dayOfOrder;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDayOfOrder() {
        return dayOfOrder;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "ALLOrders \n{" +
                "User: " + user +
                ", day of Order: " + dayOfOrder +
                ", product: " + product +
                '}';
    }
}
