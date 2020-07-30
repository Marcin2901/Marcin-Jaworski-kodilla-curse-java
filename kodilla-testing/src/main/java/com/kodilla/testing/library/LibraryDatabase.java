package com.kodilla.testing.library;


import java.util.List;

public interface LibraryDatabase {
    //List Book in Library
    List<Book> listBooksWithCondition(String TitleFragment);
    //List Book in borrow
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //Someone want rent a book
    boolean rentABook(LibraryUser libraryUser, Book book);
    //Someone want return a book
    int returnBooks(LibraryUser libraryUser);
}
