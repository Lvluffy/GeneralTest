package com.luffy.test.tdesignpatternlib.behavior.mediator.patterns;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 具体同事类：买方
 */
public class Buyer extends Customer {
    public Buyer(String name) {
        super(name);
    }

    @Override
    public String send(String ad) {
        return medium.relay(name, ad);
    }

    @Override
    public String receive(String from, String ad) {
        return from + "说: " + ad + "\n";
    }
}
