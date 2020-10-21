package com.kodilla.stream.world;

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

    public void addContinent(Country country) {
        countries.add(country);
    }

    public boolean removeContinent(Country country) {
        return countries.remove(country);
    }
}

