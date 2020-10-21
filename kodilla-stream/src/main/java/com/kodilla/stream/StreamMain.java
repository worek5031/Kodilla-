package com.kodilla.stream;


import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;

public class StreamMain {
    public static void main(String[] args) {

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

        world.addContinent(Europe);
        world.addContinent(Africa);
        world.addContinent(Asia);



        Europe.addCountry(Poland);
        Europe.addCountry(Italy);
        Europe.addCountry(Germany);

        Asia.addCountry(China);
        Asia.addCountry(India);
        Asia.addCountry(Indonesia);

        Africa.addCountry(RSA);
        Africa.addCountry(Morocco);
        Africa.addCountry(Angola);


        System.out.println(world.getWorldPopulation());
        System.out.println(world.getListOfCountries());

            }
}