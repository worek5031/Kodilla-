package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

@Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

@Test
    void testFindByPaid() {
    //Given
    TaskFinancialDetails taskFinancialDetails =
            new TaskFinancialDetails(new BigDecimal(115), false);
    taskFinancialDetailsDao.save(taskFinancialDetails);
    int id = taskFinancialDetails.getId();

    //When
    List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);

    //Then
    Assertions.assertEquals(1, resultList.size());

    //CleanUp
    taskFinancialDetailsDao.deleteById(id);
    }
}

