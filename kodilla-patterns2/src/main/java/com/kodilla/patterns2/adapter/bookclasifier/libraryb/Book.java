package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String autor;
    private final String title;
    private final int  publiccationYer;

    public Book(String autor, String title, int publiccationYer) {
        this.autor = autor;
        this.title = title;
        this.publiccationYer = publiccationYer;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitle() {
        return title;
    }

    public int getPubliccationYer() {
        return publiccationYer;
    }
}
