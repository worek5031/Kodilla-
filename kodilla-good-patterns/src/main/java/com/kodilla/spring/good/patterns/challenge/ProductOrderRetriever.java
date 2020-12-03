package com.kodilla.spring.good.patterns.challenge;

import java.time.LocalDateTime;

public class ProductOrderRetriever {

    public ProductOrder retrieve() {
        User user = new User("Peter", "Pan");
        LocalDateTime orderDate = LocalDateTime.of(2020, 11, 30, 18, 18);
        String product = "Sensodyne 100 ml";
        int orderQuantity = 10;

        return new ProductOrder(user, orderDate, product, orderQuantity);

    }

}
