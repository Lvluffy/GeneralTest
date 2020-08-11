package com.luffy.test.tdesignpatternlib.structure.bridge.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 钱包（扩展抽象化角色）
 */
public class Wallet extends Bag {
    public Wallet(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return "钱包";
    }
}
