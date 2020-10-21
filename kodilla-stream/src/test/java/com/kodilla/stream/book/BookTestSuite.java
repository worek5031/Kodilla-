package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookTestSuite {
   @Test

void testGetListUsingFor() {
       //Given
       BookDirectory bookDirectory = new BookDirectory();

       //When
       List<Book> books = bookDirectory.getList();


       //Then
       int numberOfBooksPublishedAfter2007 = 0;
       for (Book book : books) {
           if (book.getYearOfPublication() > 2007) {
               numberOfBooksPublishedAfter2007++;
           }
       }
           Assert.assertEquals(3, numberOfBooksPublishedAfter2007);
   }
}


