// This class will add new books or tell if a book is available or not.
package com.github.zzorgg.todomate.app.model;

public class Book {

    private int id; // unique id of the book (isbn)
    private String title; // title of the book
    private String author; // author of the book
    private boolean isAvailable; // whether book is available in the library or not

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

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
