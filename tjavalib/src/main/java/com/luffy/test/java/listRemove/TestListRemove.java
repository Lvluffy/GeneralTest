package com.luffy.test.java.listRemove;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        test3(list);
        System.out.println(list);
    }

    private static void test1(List<String> list) {
        for (String string : list) {
            if ("1".equals(string) || "3".equals(string) || "5".equals(string)) {
                list.remove(string);
            }
        }
    }

    private static void test2(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if ("1".equals(string) || "3".equals(string) || "5".equals(string)) {
                list.remove(string);
            }
        }
    }

    private static void test3(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if ("1".equals(string) || "3".equals(string) || "5".equals(string)) {
                iterator.remove();
            }
        }
    }
}
