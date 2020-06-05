package com.luffy.test.java.reflect;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void speak(String name) {
        System.out.println("My name is " + name);
    }

    private void run() {
        System.out.println("Running");
    }

    private String[] intro(String name, String age) {
        String[] strings = new String[2];
        strings[0] = name;
        strings[1] = age;
        return strings;
    }
}
