package com.kodilla.spring.stream.world;

import java.util.LinkedList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countries = new LinkedList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return new LinkedList<>(countries);
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return countries.remove(country);
    }
}

