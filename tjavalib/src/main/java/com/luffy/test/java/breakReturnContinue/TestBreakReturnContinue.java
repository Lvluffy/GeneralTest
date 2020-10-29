package com.luffy.test.java.breakReturnContinue;

public class TestBreakReturnContinue {

    public static void main(String[] args) {
        testBreak();
        testReturn();
        testContinue();
    }

    private static void testBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("testBreak i = " + i);
        }
    }

    private static void testReturn() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println("testReturn i = " + i);
        }
    }

    private static void testContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("testContinue i = " + i);
        }
    }
}
