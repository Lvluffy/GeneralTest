package com.luffy.test.java.createInstance;

public class CreateInstance {

    public static <T> T create(Class<T> clazz) {
        T instance;
        try {
            instance = clazz.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return instance;
    }
}
