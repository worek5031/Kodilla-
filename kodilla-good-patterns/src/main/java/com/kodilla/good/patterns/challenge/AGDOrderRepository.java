package com.kodilla.good.patterns.challenge;

import java.time.LocalDateTime;

public class AGDOrderRepository implements RepoGeneral {

    public void ordered(final User user, final LocalDateTime orderDate,  final String product, final int quantity) {
        System.out.println("Order placed by" + " " + user + " " + "for" + " " + product);
    }
}
