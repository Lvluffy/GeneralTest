package com.luffy.test.java.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by lvlufei on 2020-06-08
 *
 * @name 反射
 */
public class TestReflect {
    public static void main(String[] args) {
        Student student = new Student("李四");
        try {
            Class mClass1 = student.getClass();
            Method mMethod1 = mClass1.getDeclaredMethod("run");
            mMethod1.setAccessible(true);
            mMethod1.invoke(student);

            Class mClass2 = student.getClass();
            Method mMethod2 = mClass2.getDeclaredMethod("speak", String.class);
            mMethod2.invoke(student, "hh");

            Class mClass3 = student.getClass();
            Method mMethod3 = mClass3.getDeclaredMethod("intro", String.class, String.class);
            mMethod3.setAccessible(true);
            String[] strings = (String[]) mMethod3.invoke(student, "张三", "20");
            System.out.println(Arrays.toString(strings));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
