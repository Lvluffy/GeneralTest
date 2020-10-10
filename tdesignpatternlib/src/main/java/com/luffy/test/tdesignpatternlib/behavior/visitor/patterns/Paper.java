package com.luffy.test.tdesignpatternlib.behavior.visitor.patterns;

/**
 * Created by lvlufei on 2020-10-10
 *
 * @name 具体元素：纸
 */
public class Paper implements Material {
    @Override
    public String accept(Company visitor) {
        return visitor.create(this);
    }
}
