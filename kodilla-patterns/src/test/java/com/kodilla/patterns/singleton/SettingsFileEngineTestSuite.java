package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SettingsFileEngineTestSuite {

    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName() {
        String fileName = settingsFileEngine.getFileName();
        System.out.println("Opening: " + fileName);
        Assertions.assertEquals("myapp.settings", fileName);
    }
    @Test
    void testLoadSettings() {
        //Given
        //When

        boolean result = settingsFileEngine.loadSettings();
        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void testSaveSettings() {
        //Given
        //When

        boolean result = settingsFileEngine.saveSettings();
        //Then
        Assertions.assertTrue(result);
    }
}
