package com.luffy.test.tdesignpatternlib.behavior.command.patterns;

/**
 * Created by lvlufei on 2020-08-12
 *
 * @name 服务员（调用者角色）
 */
public class Waiter {

    private Breakfast changFen, hunDun, heFen;

    public void setChangFen(Breakfast changFen) {
        this.changFen = changFen;
    }

    public void setHunDun(Breakfast hunDun) {
        this.hunDun = hunDun;
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }

    public int chooseChangFen() {
        return changFen.cooking();
    }

    public int chooseHunDun() {
        return hunDun.cooking();
    }

    public int chooseHeFen() {
        return heFen.cooking();
    }
}
