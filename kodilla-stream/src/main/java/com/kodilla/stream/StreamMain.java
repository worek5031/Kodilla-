package com.kodilla.stream;

import com.kodilla.stream.person.People;

import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        String result = People.getList().stream()
                .collect(Collectors.joining("!", "", ""));

        System.out.println(result);
    }
}
