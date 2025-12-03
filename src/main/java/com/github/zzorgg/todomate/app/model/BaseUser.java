package com.github.zzorgg.todomate.app.model;

public class BaseUser {
    private int id;
    private String name;

    public BaseUser() {
        this.id = -1;
        this.name = "Unknown";
    }

    public BaseUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
