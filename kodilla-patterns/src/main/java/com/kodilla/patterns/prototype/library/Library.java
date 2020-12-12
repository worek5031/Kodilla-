package com.kodilla.patterns.prototype.library;

import java.util.*;

public class Library extends Prototype<Library> {
    String name;
    List<Book> books = new LinkedList<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws  CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new LinkedList<>();
        for (Book theBooks : books) {
            Book cloneBooks = new Book(theBooks.getTitle(), theBooks.getAuthor(), theBooks.getPublicationDate());
            cloneLibrary.getBooks().add(theBooks);
        }
        return cloneLibrary;
    }
}

