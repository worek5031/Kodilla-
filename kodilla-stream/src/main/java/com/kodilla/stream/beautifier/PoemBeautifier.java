package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poemDecorator, String text) {
        String result = (poemDecorator + text);
        System.out.println("Nowe słowo" + " " + result);
    }
}
