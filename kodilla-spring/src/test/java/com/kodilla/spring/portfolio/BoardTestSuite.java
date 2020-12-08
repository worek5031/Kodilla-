package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When & Then
        System.out.println(board.toDoList);
        System.out.println(board.inProgressList);
        System.out.println(board.doneList);





    }
}
