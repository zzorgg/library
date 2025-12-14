package com.github.zzorgg.todomate.app;

import com.github.zzorgg.todomate.app.model.BaseUser;
import com.github.zzorgg.todomate.app.model.Book;
import com.github.zzorgg.todomate.app.model.Librarian;
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
        BaseUser user = new Member(2, "saad", 2);
        BaseUser user1 = new Librarian(1, "babu");
        System.out.println(user.user());
        System.out.println(user1.user());
        System.out.println(newMember);
    }
}
