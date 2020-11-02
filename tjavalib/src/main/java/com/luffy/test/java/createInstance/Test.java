package com.luffy.test.java.createInstance;

public class Test {
    public static void main(String[] args) {
        TestInstance testInstance = CreateInstance.create(TestInstance.class);
        System.out.println(testInstance.test());

    }
}
