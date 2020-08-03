package com.luffy.test.java.math;

/**
 * Created by lvlufei on 2020-08-03
 *
 * @name 数学工具类
 */
public class MathUtils {

    private MathUtils() {
    }

    /**
     * 两者中最大的数
     *
     * @param var0
     * @param var1
     */
    public static int max(int var0, int var1) {
        int result = Math.max(var0, var1);
        System.out.println(result);
        return result;
    }

    /**
     * 两者中最小的数
     *
     * @param var0
     * @param var1
     */
    public static int min(int var0, int var1) {
        int result = Math.min(var0, var1);
        System.out.println(result);
        return result;
    }

    /**
     * 绝对数
     *
     * @param value
     */
    public static int abs(int value) {
        int result = Math.abs(value);
        System.out.println(result);
        return result;
    }

    /**
     * 次方/开次方
     *
     * @param var0
     * @param var1
     * @return
     */
    public static double pow(double var0, double var1) {
        double result = Math.pow(var0, var1);
        System.out.println(result);
        return result;
    }

    /**
     * 对数
     *
     * @param value
     * @param base
     * @return
     */
    public static int log(double value, double base) {
        int result = (int) (Math.log(value) / Math.log(base));
        System.out.println(result);
        return result;
    }

    /**
     * 对数
     *
     * @param value
     * @return
     */
    public static int log2(double value) {
        return log(value, 2);
    }

    /**
     * 对数
     *
     * @param value
     * @return
     */
    public static int log8(double value) {
        return log(value, 8);
    }

    /**
     * 对数
     *
     * @param value
     * @return
     */
    public static int log10(double value) {
        return log(value, 10);
    }

    /**
     * 对数
     *
     * @param value
     * @return
     */
    public static int log16(double value) {
        return log(value, 16);
    }


    public static void main(String[] args) {
        MathUtils.max(1, 10);
        MathUtils.min(1, 10);
        MathUtils.abs(-10);
        MathUtils.log16(0);
        MathUtils.log16(1);
        MathUtils.log16(2);
        MathUtils.log16(4);
        MathUtils.log16(8);
        MathUtils.log16(16);
        MathUtils.log16(32);
        MathUtils.log16(64);
        MathUtils.log16(128);
        MathUtils.log16(256);
        MathUtils.log16(512);
        MathUtils.log16(1024);
        MathUtils.log16(2048);

        MathUtils.pow(3, 4);
        MathUtils.pow(81, 1d / 4);
    }

}
