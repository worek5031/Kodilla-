package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continents = new LinkedList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return continents.remove(continent);
    }

    @Override
    public String toString() {
        return "World{" +
                "continents=" + continents +
                '}';
    }

    public World() {
    }

    public List<String> getListOfCountries() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .filter(countries -> countries.getPopulation().compareTo(BigDecimal.valueOf(50000000)) == -1)
                .map(Country::getCountry)
                .collect(Collectors.toList());
    }
    public BigDecimal getWorldPopulation() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .filter(countries -> countries.getPopulation().compareTo(BigDecimal.valueOf(50000000)) == 1)
                .map(countries -> countries.getPopulation())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
