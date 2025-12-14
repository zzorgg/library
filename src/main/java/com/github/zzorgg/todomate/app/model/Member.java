// a member is a person who is registered with the library and is allowed to borrow books
package com.github.zzorgg.todomate.app.model;

public class Member extends BaseUser{
    private int borrowedBooks; // how many books they have borrowed

   // super called here will go the default constructor in the base user class
    public Member() {
        super();
        this.borrowedBooks = 0;
    }

    // super here will go to the param constructor in the base user class
    public Member(int memberId, String name, int borrowedBooks) {
        super(memberId,name);
        this.borrowedBooks = borrowedBooks;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String user() {
        return "Member";
    }
    // To print using the reference variable override the toString()
    @Override
    public String toString() {
        return "Member: " +
                "memberId=" + getId() +
                ", name='" + getName() + '\'' +
                ", borrowedBooks=" + borrowedBooks;
    }
}
