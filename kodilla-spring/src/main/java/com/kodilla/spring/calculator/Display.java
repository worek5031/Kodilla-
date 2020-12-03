package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Display {

    @Autowired
    Calculator calculator;


    public void displayValue(double val) {
        System.out.println("Result is: ");
            }

}
