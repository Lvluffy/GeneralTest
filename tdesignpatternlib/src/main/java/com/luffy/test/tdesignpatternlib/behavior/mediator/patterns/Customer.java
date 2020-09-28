package com.luffy.test.tdesignpatternlib.behavior.mediator.patterns;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 抽象客户
 */
public abstract class Customer {
    protected Medium medium;
    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public abstract String send(String ad);

    public abstract String receive(String from, String ad);
}
