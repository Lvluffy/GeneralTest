package com.luffy.test.tdesignpatternlib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 牛（具体产品角色）
 */
public class Cattle implements Animal {
    @Override
    public String show() {
        return "新牛出生";
    }
}
