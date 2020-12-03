package com.kodilla.spring.stream.portfolio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Board {
    private final List<TaskList> taskLists = new LinkedList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList (TaskList taskList) {
        taskLists.add(taskList);
    }
    public boolean removeTaskList (TaskList taskList) {
        return taskLists.remove(taskList);
    }
    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
            }

    @Override
    public String toString() {
        return "Board{" +
                "taskLists=" + taskLists +
                ", name='" + name + '\'' +
                '}';
    }
}