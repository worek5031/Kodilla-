package com.kodilla.spring.testing.shape;

public class Circle implements Shape {
    String name = "Circle";
    int field = 50;

    public String getShapeName() {
        return name;
            }
    public int getField() {
        return field;
    }
}
