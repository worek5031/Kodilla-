package com.kodilla.testing.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testLoopAndConditionalBreakpoints {
    @Test
    public void testLoops() {
        //Given

        long sum = 0;

        //When
        int n;
        for (n = 0; n < 1000; n++) {
            sum += n;
        }
        System.out.println("(" + n + ") Sum equals " + sum);

        //Then
        Assertions.assertEquals(499500, sum);
    }
}
