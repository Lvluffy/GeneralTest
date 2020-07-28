package com.luffy.test.android.ui.designMode.behavior.chainOfResponsibility;

/**
 * Created by lvlufei on 2020-07-28
 *
 * @name 组长
 */
public class HandlerGroupLeader extends Handler {

    @Override
    void handleRequest(int days) {
        if (days <= 1) {
            System.out.println("组长批准：" + days + "天");
        } else {
            if (getHandler() != null) {
                getHandler().handleRequest(days);
            } else {
                System.out.println("请假天数太多，没有人批准");
            }
        }
    }
}
