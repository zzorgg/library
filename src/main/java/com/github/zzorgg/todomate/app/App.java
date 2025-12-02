package com.github.zzorgg.todomate.app;

import com.github.zzorgg.todomate.app.model.Book;
import com.github.zzorgg.todomate.app.model.Member;

public class App {

    public static void main(String[] args) {

        // Constructors give an object its initial state.
        // After the object is created, we can use setters to modify that state.
        Book b = new Book();
        b.setId(101);
        b.setTitle("Clean Code");
        b.setAuthor("Robert C. Martin");
        b.setAvailable(true);

        System.out.println(b.getAuthor());

        // This Member object is initialized using a parameterized constructor.
        // Printing the object works only if Member overrides toString().
        Member newMember = new Member(1, "saif", 1);
        System.out.println(newMember);
    }
}
