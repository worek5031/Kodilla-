package com.kodilla.spring.exception.main;

import com.kodilla.spring.exception.io.FileReader;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
