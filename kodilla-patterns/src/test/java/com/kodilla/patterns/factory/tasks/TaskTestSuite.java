package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTestSuite {
    @Test
    void testTaskGetName() {
        //Given
        TaskFactory task1 = new TaskFactory();
        //When
        Task driving = task1.makeTask(TaskFactory.DRIVING);
        //Then
        Assertions.assertEquals("Poznan drive", driving.getTaskName());
    }
    @Test
    void testExecuteTask() {
        //Given
        TaskFactory task2 = new TaskFactory();
        //When
        Task shopping = task2.makeTask(TaskFactory.SHOPPING);
        //Then
        Assertions.assertEquals("Executing shopping task", shopping.executeTask());
    }
    @Test
    void testIsExecutedTask() {
        //Given
        TaskFactory task3 = new TaskFactory();
        //When
        Task painting = task3.makeTask(TaskFactory.PAINTING);
        //Then
        Assertions.assertEquals(true, painting.isTaskExecuted());
    }

}
