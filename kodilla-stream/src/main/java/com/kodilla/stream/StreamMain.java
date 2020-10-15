package com.kodilla.stream;


import com.kodilla.stream.book.BookDirectory;


public class StreamMain {
    public static void main(String[] args) {

        BookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
    }
}