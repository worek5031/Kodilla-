package com.kodilla.spring.good.patterns.challenge;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderServiceGeneral {

    public boolean order(final User user, final LocalDateTime orderDate, final String product, final int orderQuantity) {
        System.out.println("Order is being processed for" + " " + user + " " + "placed on" + " " + orderDate + " " + "for" + product + " " + "quantity:" + " " + orderQuantity);
        return true;
    }
}
