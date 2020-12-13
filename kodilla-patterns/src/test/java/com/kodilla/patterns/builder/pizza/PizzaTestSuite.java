package com.kodilla.patterns.builder.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTestSuite {
    @Test
    void pizzaTest() {
        //Given
        Pizza pizza = new Pizza("thin", "spicy", "mushrooms", "ham", "onions");
        //When
        System.out.println(pizza);
        int result = pizza.getIngredients().size();
        //Then
        Assertions.assertEquals(3, result);
    }
    @Test
    void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);
        //When
        int howManyIngredients = pizza.getIngredients().size();
        //Then
        Assertions.assertEquals(3, howManyIngredients);
    }
}
