package com.luffy.test.java.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by lvlufei on 2020-06-08
 *
 * @name 信号量
 */
public class TestSemaphore {

    private static Semaphore mSemaphore = new Semaphore(0);
    private static final int INIT_RETRY_MAX_NUM = 5;

    private static void init() {
        new Thread("TestSemaphore") {
            @Override
            public void run() {
                int initCount = 0;
                while (initCount++ < INIT_RETRY_MAX_NUM) {
                    if (initCount < INIT_RETRY_MAX_NUM) {
                        System.out.println("is running");
                        if (initCount == 3) {
                            mSemaphore.release();
                        }
                        try {
                            if (mSemaphore.tryAcquire(5 * 1000, TimeUnit.MILLISECONDS)) {
                                initCount = INIT_RETRY_MAX_NUM - 1;
                            }
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    }

                }
            }
        }.start();
    }

    public static void main(String[] args) {
        init();
    }
}
