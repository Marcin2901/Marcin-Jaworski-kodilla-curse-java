package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBook(){
        //Give
        //Creating book
        Book book1 = new Book("Book1", "Author1", LocalDate.of(2000,1,10));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2001,1,10));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2002,1,10));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(2003,1,10));
        Book book5 = new Book("Book5", "Author5", LocalDate.of(2004,1,10));

        //Creating library
        Library library = new Library("Library nr 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        //Creating copedLibrary
        Library copedLibrary = null;
        try{
            copedLibrary = library.shallowCopy();
            copedLibrary.setName("Library nr 2");
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //Creating deepCloneLibrary
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library nr 3");
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book3);

        //Then
        System.out.println(library);
        System.out.println(copedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4,library.getBooks().size());
        Assert.assertEquals(4,copedLibrary.getBooks().size());
        Assert.assertEquals(5,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(),copedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
