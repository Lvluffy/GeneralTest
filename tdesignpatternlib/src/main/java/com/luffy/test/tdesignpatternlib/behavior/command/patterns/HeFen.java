package com.luffy.test.tdesignpatternlib.behavior.command.patterns;

/**
 * Created by lvlufei on 2020-08-12
 *
 * @name 河粉（具体命令角色）
 */
public class HeFen implements Breakfast {
    private HeFenChef receiver;

    public HeFen() {
        receiver = new HeFenChef();
    }

    @Override
    public int cooking() {
        return receiver.cooking();
    }
}
