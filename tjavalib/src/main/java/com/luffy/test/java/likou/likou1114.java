package com.luffy.test.java.likou;

/**
 * Created by lvlufei on 2020-11-02
 *
 * @name 我们提供了一个类：
 * <p>
 * public class Foo {
 *   public void first() { print("first"); }
 *   public void second() { print("second"); }
 *   public void third() { print("third"); }
 * }
 * 三个不同的线程将会共用一个 Foo 实例。
 * <p>
 * 线程 A 将会调用 first() 方法
 * 线程 B 将会调用 second() 方法
 * 线程 C 将会调用 third() 方法
 * 请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。
 * <p>
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: "firstsecondthird"
 * 解释:
 * 有三个线程会被异步启动。
 * 输入 [1,2,3] 表示线程 A 将会调用 first() 方法，线程 B 将会调用 second() 方法，线程 C 将会调用 third() 方法。
 * 正确的输出是 "firstsecondthird"。
 * <p>
 * 示例 2:
 * 输入: [1,3,2]
 * 输出: "firstsecondthird"
 * 解释:
 * 输入 [1,3,2] 表示线程 A 将会调用 first() 方法，线程 B 将会调用 third() 方法，线程 C 将会调用 second() 方法。
 * 正确的输出是 "firstsecondthird"。
 * <p>
 * 提示：
 * 尽管输入中的数字似乎暗示了顺序，但是我们并不保证线程在操作系统中的调度顺序。
 * 你看到的输入格式主要是为了确保测试的全面性。
 */
public class likou1114 {

    public static void main(String[] args) {
        int[] ints = {3, 1, 2};
        execute(ints);
    }

    public static void execute(int[] nums) {
        Foo foo = new Foo();
        try {
            for (int i : nums) {
                if (i == 1) {
                    foo.first(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                System.out.println("first");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                if (i == 2) {
                    foo.second(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                System.out.println("second");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
                if (i == 3) {
                    foo.third(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                System.out.println("third");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Foo {

        public Foo() {
        }

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            printSecond.run();
        }

        public void third(Runnable printThird) throws InterruptedException {
            printThird.run();
        }
    }

}
