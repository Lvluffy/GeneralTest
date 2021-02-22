package com.luffy.tthreadlib;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by lvlufei on 2021-02-22
 *
 * @name 线程池的参数
 * 1，corePoolSize（核心线程数）
 * 2，maximumPoolSize（最大线程数）
 * 3，keepAliveTime（线程保活时间）
 * 4，workQueue（任务队列）
 * 5，threadFactory（线程工厂)
 * 6，handler（线程饱和策略）
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        testQueue();
    }

    public static void testQueue() {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, queue);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务一：" + Thread.currentThread().getName());
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务二：" + Thread.currentThread().getName());
            }
        });
    }
}
