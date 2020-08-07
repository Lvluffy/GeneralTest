package com.luffy.test.designpatternslib.create.builder.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 2号装修工
 */
public class No2Decorator extends Decorator {
    @Override
    void buildWall() {
        product.setWall("壁纸墙壁");
    }

    @Override
    void buildTV() {
        product.setTv("网络电视");
    }

    @Override
    void buildSofa() {
        product.setSofa("国内沙发");
    }
}
