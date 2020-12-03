package com.kodilla.spring.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile()  {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names").getFile());
        Path path = Paths.get(file.getPath());
        try {

            Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku");
        }
        System.out.println(file.getPath());
    }
}
