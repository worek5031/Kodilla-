package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Display {

    @Autowired
    Calculator calculator;


    public double displayValue(double val) {
        calculator.add(8, 4);
        return val;
    }

}
