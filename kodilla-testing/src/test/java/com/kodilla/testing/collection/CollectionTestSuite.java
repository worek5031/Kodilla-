package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Starting testing of even numbers list creation");
    }
    @AfterEach
    public void after() {
        System.out.println("Finished creating the list");
    }
    @DisplayName("Creating the task 6.3")

    @Test
    void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> normalList = new ArrayList<Integer>();

        normalList.add(1);
        normalList.add(13);
        normalList.add(3);
        normalList.add(5);
        normalList.add(7);
        normalList.add(8);

        List<Integer> expectedResult = Arrays.asList(8);
        List<Integer> actualResult = oddNumbersExterminator.exterminate(normalList);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testOddNumbersExterminatorEmptyList() {

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        ArrayList<Integer> emptyList = new ArrayList<Integer>();

    emptyList.add(6);


        List<Integer> actualResult = oddNumbersExterminator.exterminate(emptyList);
        Assertions.assertEquals(Arrays.asList(6), actualResult);

}
}

