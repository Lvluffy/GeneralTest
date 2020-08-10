package com.luffy.test.designpatternslib.structure.decorator.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 美女变身（抽象装饰角色）
 */
public abstract class Changer implements Belle {

    private Belle belle;

    public Changer(Belle belle) {
        this.belle = belle;
    }

    @Override
    public String display() {
        return belle.display();
    }

    public abstract String change();
}
