package com.kodilla.spring.testing.shape;

public class Triangle implements Shape {
    String name = "Triangle";
    int field = 20;

    public String getShapeName() {
        return name;
    }
    public int getField() {
        return field;
    }
}
