package com.luffy.test.java.bitOperation;

/**
 * Created by lvlufei on 2020-09-21
 *
 * @name 异或操作
 */
public class ExclusiveOrOperation {

    public void exchangeSimple(int a, int b) {
        System.out.println("a=" + a + ",b=" + b);
        long start = System.currentTimeMillis();
        int temp = a;
        a = b;
        b = temp;
        long end = System.currentTimeMillis();
        System.out.println("a=" + a + ",b=" + b + ",time=" + (end - start));
    }

    public void exchangeMedium(int a, int b) {
        System.out.println("a=" + a + ",b=" + b);
        long start = System.currentTimeMillis();
        a = a + b;
        b = a - b;
        a = a - b;
        long end = System.currentTimeMillis();
        System.out.println("a=" + a + ",b=" + b + ",time=" + (end - start));
    }

    public void exchangeDifficult(int a, int b) {
        System.out.println("a=" + a + ",b=" + b);
        long start = System.currentTimeMillis();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        long end = System.currentTimeMillis();
        System.out.println("a=" + a + ",b=" + b + ",time=" + (end - start));
    }

    public static void main(String[] args) {
        ExclusiveOrOperation exclusiveOrOperation = new ExclusiveOrOperation();
        exclusiveOrOperation.exchangeSimple(3, 6);
        exclusiveOrOperation.exchangeMedium(3, 6);
        exclusiveOrOperation.exchangeDifficult(3, 6);
    }
}
