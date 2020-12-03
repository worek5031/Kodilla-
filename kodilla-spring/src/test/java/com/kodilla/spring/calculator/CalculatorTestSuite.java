package com.kodilla.spring.calculator;

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
        double a = 9;
        double b = 4;

        //When

        calculator.add(a, b);
        calculator.sub(a, b);
        calculator.mul(a, b);
        calculator.div(a, b);



        //Then
        //do nothing

    }
}
