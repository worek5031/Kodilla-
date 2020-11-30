package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class RentalRepository {

    public static boolean rented(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
       System.out.println("Rented car for " + user.getName() + " " + user.getSurname() + " " + "from" + carRentFrom.toString() + " " + "till" + " " + carRentTo.toString());
        return true;
    }

}
