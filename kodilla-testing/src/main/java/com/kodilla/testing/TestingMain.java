package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator testCalculator = new Calculator();

        if((testCalculator.addAtoB(140, 60)==204) && (testCalculator.substractBfromA(140, 60)==80)) {
            System.out.println("Test ok");
        }
        else {
            System.out.println("Test failed");
        }
    }
}

