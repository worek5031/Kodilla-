package com.kodilla.good.patterns.rental;

public class RentalDto {

    public User user;
    public boolean isRente;

    public RentalDto(User user, boolean isRente) {
        this.user = user;
        this.isRente = isRente;
    }

    public User getUser() {
        return user;
    }

    public boolean isRente() {
        return isRente;
    }
}
