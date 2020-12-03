package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    @Autowired
    Display display;

    public double add(double a, double b) {
        double adding = a + b;
        display.displayValue(adding);
        return adding;
    }
    public double sub(double a, double b) {
        double substract = a - b;
        display.displayValue(substract);
        return substract;
        }
    public double mul(double a, double b) {
        double multiply = a * b;
        display.displayValue(multiply);
        return multiply;
    }
    public double div(double a, double b) {
        double divided = a / b;
        display.displayValue(divided);
        return a / b;
    }

}
