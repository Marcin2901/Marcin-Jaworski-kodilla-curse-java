package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean order(User user, LocalDateTime dayOfOrder, Product product);
}
