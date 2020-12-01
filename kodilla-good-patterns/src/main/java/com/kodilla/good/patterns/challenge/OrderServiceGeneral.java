package com.kodilla.good.patterns.challenge;

import java.time.LocalDateTime;

public interface OrderServiceGeneral {
    public boolean order(User user, LocalDateTime orderDate, String product, int quantity);

}
