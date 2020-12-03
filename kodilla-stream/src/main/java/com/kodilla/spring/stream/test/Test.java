package com.kodilla.spring.stream.test;

import java.util.ArrayList;
import java.util.List;

interface Shape {

    public String getShapeName();
    public int getField();
}


class Circle implements Shape {

    public String getShapeName() {
        return "Test";
    }
    public int getField() {
        return 3333;
    }
}

class Shapes implements Shape {
    private String name;
    private int field;


    public Shapes(String name, int field) {
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
    public String getShapeName() {
        return "Square";
    }
    public int getField() {
        return 55;
    }
}
class Triangle implements Shape {

        public String getShapeName() {
        return "Triangle";
    }
    public int getField() {
        return 345;
    }
}

class ShapeCollector {

    List<Shape> figureList = new ArrayList<>();


    public void addFigure(Shape shape) {
        figureList.add(shape);
    }
    public void removeFigure(int n) {
        figureList.remove(n);
    }

}

class Application {

    public static void main(String[] args) {

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle());
        shapeCollector.addFigure(new Square());
        shapeCollector.addFigure(new Triangle());
        shapeCollector.addFigure(new Shapes("Rectangle", 66));

        System.out.println("Liczba elementów kolekcji:");

        System.out.println(shapeCollector.figureList.size());

        System.out.println("Elementy w kolekcji:");

        for(Shape list: shapeCollector.figureList) {
            System.out.println(list.getShapeName() + " " + list.getField());
        }
        shapeCollector.removeFigure(0);

        System.out.println("Usuwam elementy");

        for(Shape list: shapeCollector.figureList) {
            System.out.println(list.getShapeName() + " " + list.getField());
        }
    }
}
