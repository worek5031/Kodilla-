package com.kodilla.spring.good.patterns.rental;

import java.time.LocalDateTime;

public class RentRequest {

    public User user;
    public LocalDateTime rentFrom;
    public LocalDateTime rentTo;

    public User getUser() {
        return user;
    }

    public LocalDateTime getRentFrom() {
        return rentFrom;
    }

    public LocalDateTime getRentTo() {
        return rentTo;
    }
    public RentRequest(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
        this.user = user;
        this.rentFrom = rentFrom;
        this.rentTo = rentTo;
    }
}
