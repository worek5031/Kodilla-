package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategy() {
        //Given
        User peter = new Millenials("Peter Gabriel");
        User mark = new YGeneration("Mark Cuban");
        User jack = new ZGeneration("Jack London");

        //When
        String peterSharing = peter.publish();
        System.out.println("Usually Peter is: " + peterSharing );
        String markSharing = mark.publish();
        System.out.println("Usually Mark is: " + markSharing);
        String jackSharing = jack.publish();
        System.out.println("Usually Jack is: " + jackSharing);

        //Then
        Assertions.assertEquals("Publishing on Facebook", peterSharing);
        Assertions.assertEquals("Publishing on Twitter", markSharing);
        Assertions.assertEquals("Publishing on Snapchat", jackSharing);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User peter = new Millenials("Peter Gabriel");
        //When
        String peterUsualSharing = peter.publish();
        System.out.println("Usually Peter is: " + peterUsualSharing);
        peter.setSocialPublisher(new SnapchatPublisher());
        String peterExceptionSharing = peter.publish();
        System.out.println("Now Peter is: " + peterExceptionSharing);
        //Then
        Assertions.assertEquals("Publishing on Facebook", peterUsualSharing);
        Assertions.assertEquals("Publishing on Snapchat", peterExceptionSharing);
    }
}
