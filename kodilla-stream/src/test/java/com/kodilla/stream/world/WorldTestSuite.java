package com.kodilla.stream.world;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
    void testGetContinentPopulation() {
        //Given
        //Create countries and continents

        Country Poland = new Country("Poland", new BigDecimal("40000000"));
        Country Italy = new Country("Italy", new BigDecimal ("49000000"));
        Country Germany = new Country("Germany", new BigDecimal("81000000"));
        Country Angola = new Country("Angola", new BigDecimal("31000000"));
        Country Morocco = new Country("Morocco", new BigDecimal("45000000"));
        Country RSA = new Country("RSA", new BigDecimal("56000000"));
        Country China = new Country ("China", new BigDecimal("1500000000"));
        Country India = new Country("India", new BigDecimal("1700000000"));
        Country Indonesia = new Country("Indonesia", new BigDecimal("310000000"));

        Continent Europe = new Continent("Europe");
        Continent Africa = new Continent("Africa");
        Continent Asia = new Continent("Asia");

        World world = new World();

        world.addWorld(Europe);
        world.addWorld(Africa);
        world.addWorld(Asia);

        //When
        //Add countries to continents


        Europe.addCountry(Poland);
        Europe.addCountry(Italy);
        Europe.addCountry(Germany);

        Asia.addCountry(China);
        Asia.addCountry(India);
        Asia.addCountry(Indonesia);

        Africa.addCountry(RSA);
        Africa.addCountry(Morocco);
        Africa.addCountry(Angola);


        //Then
        BigDecimal pop = world.getContinents().stream()
                    .flatMap(continent -> continent.getCountries().stream())
                    .map(countries -> countries.getPopulation())
                    .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        Assert.assertEquals(new BigDecimal("3812000000"), pop);

        }


}
