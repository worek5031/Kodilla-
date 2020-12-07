package com.kodilla.spring.reader;

public final class Reader {
    final Book theBook;

    public Reader(Book theBook)
    {
        this.theBook = theBook;
    }
    public void read()
    {
        System.out.println("Reading the book: " + theBook.getTitle());
    }
}
