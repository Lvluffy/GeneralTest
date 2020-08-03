package com.luffy.test.android.ui.designMode.behavior.chainOfResponsibility;

/**
 * Created by lvlufei on 2020-07-28
 *
 * @name 经理
 */
public class HandlerManager extends Handler {

    @Override
    void handleRequest(int days) {
        if (days <= 7) {
            System.out.println("经理批准：" + days + "天");
        } else {
            if (getHandler() != null) {
                getHandler().handleRequest(days);
            } else {
                System.out.println("请假天数太多，没有人批准");
            }
        }
    }
}
