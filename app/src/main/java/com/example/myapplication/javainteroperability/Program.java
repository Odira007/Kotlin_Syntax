package com.example.myapplication.javainteroperability;

public class Program {
    public static void main(String[] args) {
        Meeting3 meeting3 = new com.example.myapplication.javainteroperability.Meeting3();

//        System.out.println(meeting3.getTitle());

        meeting3.title = "Emergency";
        System.out.println(meeting3.title);
        Meeting3.build();
        Utils.saveMeeting(meeting3);
    }
}
