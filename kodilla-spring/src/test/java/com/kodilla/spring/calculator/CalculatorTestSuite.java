package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;
    @Autowired
    Display display;

    @Test
    void testCalculations() {
        //Given
        double a = 8;
        double b = 4;

        //When
        double calculation = calculator.add(a, b);
        double result = display.displayValue(calculation);

        //Then
        Assertions.assertEquals(12, result);

    }
}
