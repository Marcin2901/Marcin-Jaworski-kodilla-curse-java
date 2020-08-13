package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class ProductOrderRepository implements OrderRepository{

    LinkedList<Orders> listOfOrders = new LinkedList<>();

    @Override
    public void createOrder(User user, LocalDateTime dayOfOrder, Product product) {
          listOfOrders.add(new Orders(user,dayOfOrder,product));
    }
    public LinkedList<Orders> getListOfOrders(){
        return listOfOrders;
    }

    public void printListOfOrders(LinkedList<Orders> orders){
        for(Orders print : orders){
            System.out.println(print);
        }
    }
}
