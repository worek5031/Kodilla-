package com.kodilla.spring.good.patterns.challenge;

import java.time.LocalDateTime;

public interface RepoGeneral {
    public void ordered(User user, LocalDateTime orderDate, String product, int quantity);
}
