package com.kenzie.library.model;

public abstract class Book {
    protected String title;
    protected String author;

    public abstract String convertBookToString();
    public abstract void setBookInfo(String detailString);
}
