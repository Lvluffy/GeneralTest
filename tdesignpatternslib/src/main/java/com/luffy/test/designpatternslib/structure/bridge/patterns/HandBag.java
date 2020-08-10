package com.luffy.test.designpatternslib.structure.bridge.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 挎包（扩展抽象化角色）
 */
public class HandBag extends Bag {
    public HandBag(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return "挎包";
    }
}
