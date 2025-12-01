package com.github.zzorgg.todomate.app;

import com.github.zzorgg.todomate.app.model.Book;
import com.github.zzorgg.todomate.app.model.Member;

public class App {

    public static void main(String[] args) {
        Book book = new Book(1, "saif", "ali", true);
        System.out.println(book);

        Member newMember = new Member(1, "saif", 1);
        System.out.println(newMember);
    }
}
