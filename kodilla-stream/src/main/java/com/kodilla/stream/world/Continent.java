package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {
    private final String continentName;
    private final Set<Country> countries;

    public Continent(final String continentName, final Set<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
            }

    public String getContinentName() {
        return this.continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }
    public Set<BigDecimal> getContinentPopulation() {
        return (Set<BigDecimal>) countries.stream()
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toSet());
    }
}
