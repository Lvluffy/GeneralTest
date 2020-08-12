package com.luffy.test.tdesignpatternlib.behavior.command.patterns;

/**
 * Created by lvlufei on 2020-08-12
 *
 * @name 肠粉（具体命令角色）
 */
public class ChangFen implements Breakfast {

    private ChangFenChef receiver;

    public ChangFen() {
        receiver = new ChangFenChef();
    }

    @Override
    public int cooking() {
        return receiver.cooking();
    }
}
