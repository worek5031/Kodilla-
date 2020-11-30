package com.kodilla.good.patterns.challenge;

public class OrderDto {

    public User user;
    public String product;

    public OrderDto(final User user, final String product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }
}
