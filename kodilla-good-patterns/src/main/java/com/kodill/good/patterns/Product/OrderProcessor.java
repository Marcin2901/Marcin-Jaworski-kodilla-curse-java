package com.kodill.good.patterns.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class OrderProcessor {
    InformationService informationService;
    OrderService orderService;
    OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository){
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered =  orderService.order(orderRequest.getUser(), orderRequest.getDayOfOrder(), orderRequest.getProduct());
        if(isOrdered){
            informationService.send(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDayOfOrder(), orderRequest.getProduct());
           LinkedList<Orders> list = orderRepository.getListOfOrders();
           orderRepository.printListOfOrders(list);
            return new OrderDto(orderRequest.getUser(),true);
        }
        else{
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
