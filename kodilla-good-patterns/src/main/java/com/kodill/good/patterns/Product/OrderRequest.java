package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime dayOfOrder;
    private Product product;

    public OrderRequest(User user, LocalDateTime dayOfOrder, Product product) {
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
}
