package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public final class Display {

    public void displayValue() {
        System.out.println("Wynik kalkulacji to:  ");
    }

}
