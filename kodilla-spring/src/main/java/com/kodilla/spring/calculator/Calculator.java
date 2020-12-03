package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    @Autowired
    Display display;

    double a;
    double b;

    public void add(double a, double b) {
       display.displayValue();
        System.out.println(a + b);

    }
    public void sub(double a, double b) {
        display.displayValue();
        System.out.println(a - b);
    }
    public void mul(double a, double b) {
        display.displayValue();
        System.out.println(a * b);
    }
    public void div(double a, double b) {
        display.displayValue();
        System.out.println(a / b);
    }
}
