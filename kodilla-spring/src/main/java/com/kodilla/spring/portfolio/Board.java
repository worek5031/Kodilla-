package com.kodilla.spring.portfolio;

public final class Board {

    public TaskList toDoList;
    public TaskList doneList;
    public TaskList inProgressList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }


}

