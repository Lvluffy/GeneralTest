package com.luffy.test.java.generic;

//泛型类
class GenericClass<T, K> {
    private T t;
    private K k;

    public GenericClass(T t, K k) {
        this.t = t;
        this.k = k;
    }
}

//普通类
class GeneralClass {
    Object k;
    Object v;

    public GeneralClass(Object k, Object v) {
        this.k = k;
        this.v = v;
    }
}
