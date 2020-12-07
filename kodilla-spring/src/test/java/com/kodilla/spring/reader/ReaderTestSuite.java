package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {
    @Test
    void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.reader");
        Reader reader = context.getBean(Reader.class);
        //When
        reader.read();
        //Then
        //nothing
    }
    @Test
    void testConditional() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.reader");
        boolean book2Exists = context.containsBean("book2");
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }
}
