package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;


    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList addToDo() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("ToDo Task1");
        toDoList.add("ToDo Task2");
        return new TaskList(toDoList);
    }

    @Bean(name = "inProgressList")
    public TaskList addInProgress() {
        ArrayList<String> inProgressList = new ArrayList<>();
        inProgressList.add("InProgress Task1");
        inProgressList.add("InProgress Task2");
        return new TaskList(inProgressList);
    }

    @Bean(name = "doneList")
    public TaskList addDoneList() {
        ArrayList<String> doneList = new ArrayList<>();
        doneList.add("Done Task1");
        doneList.add("Done Task2");
        return new TaskList(doneList);
    }
}
