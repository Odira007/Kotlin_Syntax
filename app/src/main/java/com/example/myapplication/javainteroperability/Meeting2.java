package com.example.myapplication.javainteroperability;

public class Meeting2 {
    private String title;
    public Meeting2(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Meeting(title: '" + title + "')";
    }

    public void backgroundSave(Saveable saveable) {
        // do work
        saveable.saved(this);
    }
}
