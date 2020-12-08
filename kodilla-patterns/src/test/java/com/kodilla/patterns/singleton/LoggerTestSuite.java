package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

       @Test
       void createLog() {
           Logger logger = Logger.INSTANCE;
           logger.log("Log1");
           logger.log("Log2");
           logger.log("Log3");

       }

       @Test
        void testLog() {
        Logger logger = Logger.INSTANCE;
        logger.getLastLog();

    }

}
