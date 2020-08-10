package com.luffy.test.designpatternslib.create.factoryMethod.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 马（具体产品角色）
 */
public class Horse implements Animal {
    @Override
    public String show() {
        return "新马出生";
    }
}
