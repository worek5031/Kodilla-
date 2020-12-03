package com.kodilla.spring.good.patterns.challenge;

import java.time.LocalDateTime;

public class ProductOrder {

    public User user;
    public LocalDateTime orderDate;
    public String product;
    public int quantity;

    public ProductOrder(final User user, final LocalDateTime orderDate, final String product, final int quantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
