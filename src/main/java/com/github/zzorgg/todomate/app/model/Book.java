// This class will add new books or tell if a book is available or not.
package com.github.zzorgg.todomate.app.model;

public class Book {

    int id; // unique id of the book (isbn)
    String title; // title of the book
    String author; // author of the book
    boolean isAvailable; // whether book is available in the library or not

    public Book() {
        this.id = -1;
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.isAvailable = false;
    }

    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable;
    }
}
