package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {
    @Test
    void testAddShape(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        //when
        Shape result = shapeCollector.addFigure(Square);
        Shape expectedResult = (Square)
        //then
        Assertions.assertEquals(expectedResult, result)
    }




}
