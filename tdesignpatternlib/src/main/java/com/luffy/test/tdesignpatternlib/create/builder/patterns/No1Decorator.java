package com.luffy.test.tdesignpatternlib.create.builder.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 1号装修工（具体建造者角色）
 */
public class No1Decorator extends Decorator {
    @Override
    void buildWall() {
        product.setWall("涂料墙壁");
    }

    @Override
    void buildTV() {
        product.setTv("液晶电视");
    }

    @Override
    void buildSofa() {
        product.setSofa("进口沙发");
    }
}
