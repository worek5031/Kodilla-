package com.kodilla.patterns.singleton;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class BoardTestSuite {
    @Test
    void testToString() {
        //Given
        //creating the task list for toDo
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->listToDo.getTasks().add(new Task("Task number " + n)));
        //creating the task list for inProgress
        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(n->listInProgress.getTasks().add(new Task("Task number " + n)));
        //creating the task list for done Tasks
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->listDone.getTasks().add(new Task("Task number " + n)));

        //creating the board and assigning the list
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object board
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //making a deep copy of object board
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assertions.assertEquals(2, board.getLists().size());
        Assertions.assertEquals(2, clonedBoard.getLists().size());
        Assertions.assertEquals(3, deepClonedBoard.getLists().size());
        Assertions.assertEquals(clonedBoard.getLists(), board.getLists());
        Assertions.assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}






