package com.example.myapplication.nullability;


public class Program {
    public static void main(String[] args) {
        Organizer org = new Organizer();
        org.closeMeeting(null); // throws NullPointerException
    }
}

class Organizer {
    public boolean closeMeeting(Meeting m) {
        return m.close();
    }
}

class Meeting {
    public boolean close() {return true;}
}
