package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String autor;
    private final String title;
    private final int  publiccationYer;
    private final String signature;

    public Book(String autor, String title, int publiccationYer, String signature) {
        this.autor = autor;
        this.title = title;
        this.publiccationYer = publiccationYer;
        this.signature = signature;
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

    public String getSignature() {
        return signature;
    }
}
