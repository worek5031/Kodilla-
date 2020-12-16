package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String LISTNAME = "To Do Task";
    private static final String DESCRIPTION = "Tasks which need to be done";
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        int id = taskList.getId();
        String listName = taskList.getListName();

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> result = taskListDao.findByListName(listName);
        Assertions.assertEquals("To Do Task", result);

        //Clean
        taskListDao.deleteById(id);
    }
}
