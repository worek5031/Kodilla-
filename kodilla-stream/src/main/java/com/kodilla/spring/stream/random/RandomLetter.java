package com.kodilla.spring.stream.random;

import java.util.Arrays;

public class RandomLetter {
    char letter;


    public String generateString(char a, int n) {
        char[] letterA = new char[n];
        Arrays.fill(letterA, a);
        return new String(letterA);
    }



}
