package com.luffy.test.tdesignpatternlib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 水果（具体产品角色）
 */
public class Fruit implements Plant {
    @Override
    public String show() {
        return "水果长成";
    }
}
