package com.kodilla.patterns.enums.hotel;

public class HotelApp {
    public static void main(String[] args) {
        System.out.println("Accomodation prices [PLN]");
        System.out.println("1. Single bed rooms");
        System.out.println("    - Low season single room: " + Season.LOW.getSingleRoomPrice());
        System.out.println("    - High season single room: " + Season.HIGH.getSingleRoomPrice());
        System.out.println("    - Holiday season single room: " + Season.HOLIDAY.getSingleRoomPrice());
        System.out.println("2. Double bed rooms");
        System.out.println("    - Low season double room: " + Season.LOW.getDoubleRoomPrice());
        System.out.println("    - High season double room: " + Season.HIGH.getDoubleRoomPrice());
        System.out.println("    - Holiday season double room: " + Season.HOLIDAY.getDoubleRoomPrice());

        }
}
