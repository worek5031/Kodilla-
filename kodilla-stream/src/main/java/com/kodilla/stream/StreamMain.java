package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Kot", (text)-> text + "aklizm");
        poemBeautifier.beautify("Kocio", (text)->text+"kwik");
        poemBeautifier.beautify("Kasztan",(text)->text.toUpperCase());

    }
}