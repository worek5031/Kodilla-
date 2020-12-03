package com.kodilla.spring.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println("Upiększony tekst:" + " " + result);
    }
}
