package com.luffy.test.tdesignpatternlib.structure.decorator.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 军旅（具体装饰角色）
 */
public class Military extends Changer {

    public Military(Belle belle) {
        super(belle);
    }

    @Override
    public String display() {
        return change();
    }

    @Override
    public String change() {
        return "军旅装";
    }
}
