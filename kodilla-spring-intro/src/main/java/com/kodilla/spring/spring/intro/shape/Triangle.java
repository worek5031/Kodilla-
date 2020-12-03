package com.kodilla.spring.spring.intro.shape;

public class Triangle implements Shape {

    @Override

    public String draw() {

        System.out.println("This is a square");

        return "This is a triangle";
    }

}
