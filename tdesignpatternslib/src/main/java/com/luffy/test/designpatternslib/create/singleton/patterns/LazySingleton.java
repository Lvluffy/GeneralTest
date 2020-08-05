package com.luffy.test.designpatternslib.create.singleton.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 懒汉式
 * <p>
 * 注意：如果编写的是多线程程序，则不要删除代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
 * 如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
