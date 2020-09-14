package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Piotr Test")
public class ForumTestSuit {
    @BeforeEach
    public void beforeEach() {
        System.out.println("Test case begin");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test case end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suit start");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test suit ended");
    }
    @DisplayName(
            "to jest pierwszy opis testu"
    )

    @Test
    void testCaseUserName() {
        SimpleUser simpleUser = new SimpleUser("ForumUser");

        String result = simpleUser.getUsername();
        String expectedResult = "ForumUser";

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("ForumUser", "John Smith");

        String result = simpleUser.getRealName();
        System.out.println("Testing" + result);

        Assertions.assertEquals("John Smith", result);
    }
}
