package com.luffy.test.designpatternslib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 蔬菜（具体产品角色）
 */
public class Vegetable implements Plant {
    @Override
    public String show() {
        return "蔬菜长成";
    }
}
