package com.github.zzorgg.todomate.app.model;

public class Librarian extends BaseUser{
    public Librarian() {
        super();
    }

    public Librarian(int id, String name) {
        super(id, name);
    }

    public void manageBooks() {
        System.out.println(getName() + " is managing books.");
    }
}
