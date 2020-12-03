package com.kodilla.spring.good.patterns.challenge;

import java.time.LocalDateTime;

public class AGDOrderService implements OrderServiceGeneral {
    public boolean order(final User user, final LocalDateTime orderDate, final String product, final int quantity) {
        System.out.println("Making an AGD order for" + " " + user + " " + "on" + " " + orderDate);
       return true;
    }
}
