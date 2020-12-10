package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //Given
        Library library = new Library("Biblioteka1");

        Book bible1 = new Book("Bible1", "Lukas", LocalDate.of(2020, 12, 01));
        Book bible2 = new Book("Bible2", "Mathew", LocalDate.of(2020, 12, 02));
        Book bible3 = new Book("Bible3", "John", LocalDate.of(2020, 12, 03));
        Book bible4 = new Book("Bible4", "Mark", LocalDate.of(2020, 12, 04));

        library.getBooks().add(bible1);
        library.getBooks().add(bible2);
        library.getBooks().add(bible3);
        library.getBooks().add(bible4);

        //create clone
        Library cloneLibrary = null;
                try{
                    cloneLibrary = library.shallowCopy();
                    cloneLibrary.setName("Biblioteka2");
                } catch(CloneNotSupportedException e)
                {
                    System.out.println(e);
                }

        Library deepCloneLibrary = null;
                try {
                    deepCloneLibrary = library.deepCopy();
                    deepCloneLibrary.setName("Biblioteka 3");
                } catch(CloneNotSupportedException e) {
                    System.out.println(e);
        }

        //When
        library.getBooks().remove(bible1);

        int result = library.getBooks().size();
        int cloneResult = cloneLibrary.getBooks().size();
        int deepCloneResult = deepCloneLibrary.getBooks().size();



        //Then
        Assertions.assertEquals(3, result);
        Assertions.assertEquals(3, cloneResult);
        Assertions.assertEquals(4, deepCloneResult);
        System.out.println(library.getName() + library.getBooks());
        System.out.println(cloneLibrary.getName() + cloneLibrary.getBooks());
        System.out.println(deepCloneLibrary.getName() + deepCloneLibrary.getBooks());



    }
}
