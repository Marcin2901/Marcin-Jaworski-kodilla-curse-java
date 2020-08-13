package com.kodill.good.patterns.Product;

public class Aplication {
    public static void main(String[] args){
        OrderRequestMake orderRequestMake = new OrderRequestMake();
        OrderRequest orderRequest = orderRequestMake.bay();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
