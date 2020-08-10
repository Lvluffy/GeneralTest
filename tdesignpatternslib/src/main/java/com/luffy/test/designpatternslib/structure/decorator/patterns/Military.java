package com.luffy.test.designpatternslib.structure.decorator.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 军旅
 */
public class Military extends Changer {

    public Military(Belle belle) {
        super(belle);
    }

    @Override
    public String change() {
        return "军旅装";
    }

    @Override
    public String display() {
        return change();
    }
}
