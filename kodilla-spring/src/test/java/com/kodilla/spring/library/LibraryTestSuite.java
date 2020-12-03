package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testLoadFromDB() {
        //Given

        //When
         library.loadFromDB();
         //Then
        //do nothing
    }
    @Test
    void testSaveToDB() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);
        //When
        library.saveToDB();
        //Then
        //do nothing
    }
}
