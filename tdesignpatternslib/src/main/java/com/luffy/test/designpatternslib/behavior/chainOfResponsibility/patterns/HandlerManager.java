package com.luffy.test.designpatternslib.behavior.chainOfResponsibility.patterns;

/**
 * Created by lvlufei on 2020-07-28
 *
 * @name 责任链模式-具体的处理者-经理
 */
public class HandlerManager extends Handler {

    @Override
    public String handleRequest(int days) {
        if (days <= MANAGER_PERMISSIONS) {
            return "经理批准：" + days + "天";
        } else {
            if (getHandler() != null) {
                return getHandler().handleRequest(days);
            } else {
                return "请假天数太多，没有人批准";
            }
        }
    }
}
