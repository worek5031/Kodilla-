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

    public void addWorld(Continent continent) {
        continents.add(continent);
    }

    public boolean removeWorld(Continent continent) {
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
                .map(Country::getCountry)
                .collect(Collectors.toList());
    }
    public BigDecimal getWorldPopulation() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(countries -> countries.getPopulation())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}