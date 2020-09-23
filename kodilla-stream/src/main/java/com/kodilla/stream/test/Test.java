package com.kodilla.stream.test;

import java.util.*;

interface Shape {

    public String getShapeName();
    public int getField();
}


class Circle implements Shape {

    private String name;
    private int field;

    public Circle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return this.name;
    }
    public int getField() {
        return this.field;
    }
}

class Square implements Shape {
    private String name;
    private int field;


    public Square(String name, int field) {
        this.name = name;
        this.field = field;

    }

    public String getShapeName() {
        return this.name;
    }
    public int getField() {
        return this.field;
    }

}

class Triangle implements Shape {
    private String name;
    private int field;

    public Triangle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return this.name;
    }
    public int getField() {
        return this.field;
    }
}

class ShapeCollector {

    List<Shape> figureList = new ArrayList<>();


    public void addFigure(Shape shape) {
        figureList.add(shape);
    }

}

class Application {

    public static void main(String[] args) {

        ShapeCollector shapeCollector = new ShapeCollector();

        List<Shape> figureList = new ArrayList<>();

        shapeCollector.addFigure(new Circle("Circle", 43));
        shapeCollector.addFigure(new Square("Square", 32));
        shapeCollector.addFigure(new Triangle("Triangle", 34));


        System.out.println(figureList.size());

        for(Shape list: figureList) {
            System.out.println(list.getShapeName() + " " + list.getField());
        }

    }
}
