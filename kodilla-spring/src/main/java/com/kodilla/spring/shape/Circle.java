package com.kodilla.spring.shape;

import org.springframework.stereotype.Component;

@Component

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        System.out.println("This is ridiculous");

        return "THis is a circle";
    }

}
