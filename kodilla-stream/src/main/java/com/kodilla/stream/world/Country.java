package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal population;
    private final String country;

    public Country(final String country, final BigDecimal population) {
        this.country = country;
        this.population = population;
    }


    public String getCountry() {
        return country;
    }

    public BigDecimal getPopulation() {
        return population;
    }
}
