package com.kodilla.good.patterns.challenge;

public class OrderDto {

    public User user;
    public boolean isRented;

    public OrderDto(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsRented() {
        return true;
    }
}
