package com.luffy.test.designpatternslib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 马（具体产品角色）
 */
public class Horse implements Animal {
    @Override
    public String show() {
        return "新马出生";
    }
}
