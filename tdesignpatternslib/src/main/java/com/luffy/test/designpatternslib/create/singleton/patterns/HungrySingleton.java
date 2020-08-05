package com.luffy.test.designpatternslib.create.singleton.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 饿汉式
 * <p>
 * 特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * <p>
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
