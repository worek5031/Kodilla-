package com.kodilla.spring.spring.intro;

import com.kodilla.spring.spring.intro.shape.Circle;
import com.kodilla.spring.spring.intro.shape.Drawer;
import com.kodilla.spring.spring.intro.shape.Figure;
import com.kodilla.spring.spring.intro.shape.Triangle;

public class SpringIntroRunner {
    public static void main(String[] args) {
        Drawer figure = new Drawer(new Figure());
        figure.doDrawing();

        Drawer circle = new Drawer(new Circle());
        System.out.println(circle.doDrawing());

        Drawer triangle = new Drawer(new Triangle());
        triangle.doDrawing();

    }
}
