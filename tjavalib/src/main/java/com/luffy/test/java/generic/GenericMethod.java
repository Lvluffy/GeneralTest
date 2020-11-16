package com.luffy.test.java.generic;

public class GenericMethod<T> {

    //实例泛型方法：实例方法可以直接使用类声明的泛型参数
    public T genericMethod(T t) {
        return t;
    }

    //静态泛型方法：静态方法不能直接使用类的泛型参数T，需要自己声明
    public static <T> T genericStaticMethod(T t) {
        return t;
    }

}


