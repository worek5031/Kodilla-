package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

       @Test
       void getLastLog() {

           //Given
           //creating logs
           Logger logger = Logger.INSTANCE;
           logger.log("Log1");
           logger.log("Log2");
           logger.log("Log3");

           logger.getLastLog();


    }

}
