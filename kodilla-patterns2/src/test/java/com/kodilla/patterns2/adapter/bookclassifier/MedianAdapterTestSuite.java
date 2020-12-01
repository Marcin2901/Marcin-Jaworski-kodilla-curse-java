package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        Book book1 = new Book("author1", "title1", 5, "signature1");
        Book book2 = new Book("author2", "title2", 7, "signature2");
        Book book3 = new Book("author3", "title3", 8, "signature3");
        Book book4 = new Book("author4", "title4", 1, "signature4");
        Book book5 = new Book("author5", "title5", 3, "signature5");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        int result = medianAdapter.publicationYearMedian(books);

        Assert.assertEquals(5, result);
    }
}
