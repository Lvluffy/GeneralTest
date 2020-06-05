package com.luffy.test.java.design;

public class ServiceFactory {
    public static IService makeService() {
        if (false) {
            return new BaseService();
        } else {
            return new SimpleService();
        }
    }
}
