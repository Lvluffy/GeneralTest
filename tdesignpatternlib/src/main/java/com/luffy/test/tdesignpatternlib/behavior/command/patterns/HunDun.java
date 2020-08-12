package com.luffy.test.tdesignpatternlib.behavior.command.patterns;

/**
 * Created by lvlufei on 2020-08-12
 *
 * @name 混沌（具体命令角色）
 */
public class HunDun implements Breakfast {
    private HunDunChef receiver;

    public HunDun() {
        receiver = new HunDunChef();
    }

    @Override
    public int cooking() {
        return receiver.cooking();
    }
}
