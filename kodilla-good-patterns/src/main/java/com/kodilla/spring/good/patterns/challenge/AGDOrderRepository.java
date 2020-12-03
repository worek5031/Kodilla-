package com.kodilla.spring.good.patterns.challenge;

import java.time.LocalDateTime;

public class AGDOrderRepository implements RepoGeneral {

    public void ordered(final User user, final LocalDateTime orderDate,  final String product, final int quantity) {
        System.out.println("AGD order placed by" + " " + user + " " + "for" + " " + product);
    }
}
