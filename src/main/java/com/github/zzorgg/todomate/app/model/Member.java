// a member is a person who is registered with the library and is allowed to borrow books
package com.github.zzorgg.todomate.app.model;

public class Member {

    private int memberId; // libraryCard
    private String name; // name of member
    private int borrowedBooks; // how many books they have borrowed

    public Member() {
        this.memberId = -1;
        this.name = "Unknown Name";
        this.borrowedBooks = 0;
    }

    public Member(int memberId, String name, int borrowedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    // To print using the reference variable override the toString()
    @Override
    public String toString() {
        return "Member: " +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
