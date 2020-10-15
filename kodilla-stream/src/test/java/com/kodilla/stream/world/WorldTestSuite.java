package com.kodilla.stream.world;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public class WorldTestSuite {
    @Test
    void testGetContinentPopulation() {
        //Given
        //Create countries and continents
        Set<Country> countries = new HashSet<>();
        countries.add(new Country("Poland", new BigDecimal("40000000")));
        countries.add(new Country("Italy", new BigDecimal ("49000000")));
        countries.add(new Country("Germany", new BigDecimal("81000000")));



        Continent europe = new Continent("Europe", countries);

        //When
        //Create relation between continents and countries


        europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europe.addCountry(new Country("Italy", new BigDecimal ("49000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("81000000")));

        //Then

        Assert.assertEquals("170000000", europe.getContinentPopulation());

    }
}
