package com.luffy.test.java.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void test() {
        Object[] objArray = new Long[1];
        objArray[0] = Long.parseLong("qww"); //编译通过，运行出错
    }

    public static void main(String[] args) {
        test();
    }

}
