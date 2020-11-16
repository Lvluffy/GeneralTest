package com.luffy.test.java.generic;

import java.util.ArrayList;
import java.util.LinkedList;

//泛型擦除
public class GenericErase {

    //下面两种方法不属于方法重载，泛型擦除后都是ArrayList
//    public void test(ArrayList<Integer> list){}
    public void test(ArrayList<String> list){}


    //下面两种方法属于方法重载，泛型擦除后一个是ArrayList，一个是LinkedList
    public void add(ArrayList<Integer> list){}
    public void add(LinkedList<String> list){}
}

