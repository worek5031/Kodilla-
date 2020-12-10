package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype<Library> {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Library deepCopy() throws  CloneNotSupportedException {
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book theBooks : books) {
            Book cloneBooks = new Book(theBooks.getTitle(), theBooks.getAuthor(), theBooks.getPublicationDate());
            cloneLibrary.getBooks().add(theBooks);
        }
        return cloneLibrary;
    }
}

