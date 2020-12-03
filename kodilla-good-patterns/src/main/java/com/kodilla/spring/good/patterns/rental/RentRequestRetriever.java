package com.kodilla.spring.good.patterns.rental;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {

        User user = new User("John", "Smith");

        LocalDateTime rentFrom = LocalDateTime.of(2020, 11, 26, 14, 10);
        LocalDateTime rentTo = LocalDateTime.of(2020, 11, 27, 14, 10);

        return new RentRequest(user, rentFrom, rentTo);

    }
}
