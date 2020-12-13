package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite {

    @Test
    void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("sesame")
                .burgers(1)
                .sauce("spicy")
                .ingredient("lettuce")
                .ingredient("tomato")
                .ingredient("onion")
                .build();
        System.out.println(bigMac);
        //When
        int ingredientsNumber = bigMac.getIngredients().size();
        int burgersNumber = bigMac.getBurgers();
        String sauceType = bigMac.getSauce();
        //Then
        Assertions.assertEquals(3, ingredientsNumber);
        Assertions.assertEquals(1, burgersNumber);
        Assertions.assertEquals("spicy", sauceType);

    }
}
