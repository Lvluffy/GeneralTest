package com.luffy.test.java;

public class Test {
    public static final int FEATURE_SUPPORT_TSMCLIENT = 0x0000001;
    public static final int FEATURE_SUPPORT_NFC = 0x0000002;
    public static final int FEATURE_SUPPORT_UNI_SETTINGS = 1 << 8;
    public static final int FEATURE_SUPPORT_SCAN_PAY = 1 << 9;

    public static void main(String[] args) {
        System.out.println("0x0000001 : " + 0x0000001);
        System.out.println("0x0000002 : " + 0x0000002);
        System.out.println("1 << 0 : " + (1 << 0));
        System.out.println("1 << 1 : " + (1 << 1));
        System.out.println("1 << 2 : " + (1 << 2));
        System.out.println("1 << 3 : " + (1 << 3));
        System.out.println("1 << 4 : " + (1 << 4));
        System.out.println("1 << 5 : " + (1 << 5));
        System.out.println("1 << 6 : " + (1 << 6));
        System.out.println("1 << 7 : " + (1 << 7));
        System.out.println("1 << 8 : " + (1 << 8));
        System.out.println("1 << 9 : " + (1 << 9));
        test();
    }

    private static void test() {
        int featureValue = FEATURE_SUPPORT_TSMCLIENT;
        featureValue += true ? FEATURE_SUPPORT_NFC : 0;
        featureValue += true ? FEATURE_SUPPORT_UNI_SETTINGS : 0;
        featureValue += true ? FEATURE_SUPPORT_SCAN_PAY : 0;
        System.out.println(featureValue);
    }
}
