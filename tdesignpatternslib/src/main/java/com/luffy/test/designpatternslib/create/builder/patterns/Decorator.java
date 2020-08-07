package com.luffy.test.designpatternslib.create.builder.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 装修工
 */
public abstract class Decorator {

    protected Parlour product = new Parlour();

    public Parlour getResult() {
        return product;
    }

    /**
     * 构建墙
     */
    abstract void buildWall();

    /**
     * 构建电视
     */
    abstract void buildTV();

    /**
     * 构建沙发
     */
    abstract void buildSofa();
}
