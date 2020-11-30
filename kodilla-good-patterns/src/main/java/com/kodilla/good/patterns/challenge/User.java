package com.kodilla.good.patterns.challenge;

public class User {

    public String name;
    public String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "" +
                "" + name + " " + lastName
                ;
    }
}
