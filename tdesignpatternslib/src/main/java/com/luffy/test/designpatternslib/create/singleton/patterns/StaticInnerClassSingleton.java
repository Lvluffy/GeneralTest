package com.luffy.test.designpatternslib.create.singleton.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 静态内部类
 * <p>
 * 类创建的时候不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，
 * 这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.instance;

    }

    private static class StaticInnerClassSingletonHolder {
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

}
