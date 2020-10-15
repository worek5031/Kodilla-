package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String country;
    private final BigDecimal population;

    public Country(String country, BigDecimal population) {
        this.country = country;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }
}
