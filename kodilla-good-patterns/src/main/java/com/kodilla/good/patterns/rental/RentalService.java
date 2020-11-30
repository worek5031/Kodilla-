package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class RentalService {

     public static boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
         System.out.println("Renting car for " + user.getName() + " " + user.getSurname() + " " + "from" + carRentFrom.toString() + " " + "till" + " " + carRentTo.toString());
         return true;
     }
}
