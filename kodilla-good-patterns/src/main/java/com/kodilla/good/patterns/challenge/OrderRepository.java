package com.kodilla.good.patterns.challenge;

import java.time.LocalDateTime;

public class OrderRepository {

    public static boolean ordered(final User user, final LocalDateTime orderDate, final String product, final int orderQuantity) {
        System.out.println("Order placed by" + " " + user + " " + "on" + " " + orderDate + " " + "for" + product + " " + "quantity:" + " " + orderQuantity);
        return true;
    }
}
