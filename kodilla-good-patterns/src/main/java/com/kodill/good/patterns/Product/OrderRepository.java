package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;
import java.util.LinkedList;

public interface OrderRepository {
    public void createOrder(User user, LocalDateTime dayOfOrder, Product product);
    public LinkedList<Orders> getListOfOrders();
    public void printListOfOrders(LinkedList<Orders> orders);
}
