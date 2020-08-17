package com.luffy.test.android.utils;

import android.os.Looper;

public class ThreadUtils {
    private ThreadUtils() {
    }

    public static ThreadUtils getInstance() {
        return ThreadUtilsHolder.instance;
    }

    private static class ThreadUtilsHolder {
        private static final ThreadUtils instance = new ThreadUtils();
    }

    /**
     * 是否为主线程
     *
     * @return
     */
    public boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /**
     * 获取当前线程的名字
     *
     * @return
     */
    public String getCurrentThreadName() {
        return Thread.currentThread().getName();
    }
}
