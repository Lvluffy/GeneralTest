package com.luffy.test.tdesignpatternlib.behavior.chainOfResponsibility.patterns;

/**
 * Created by lvlufei on 2020-07-28
 *
 * @name 责任链模式-具体的处理者-组长
 */
public class HandlerGroupLeader extends Handler {

    @Override
    public String handleRequest(int days) {
        if (days <= GROUP_LEADE_PERMISSIONS) {
            return "组长批准：" + days + "天";
        } else {
            if (getHandler() != null) {
                return getHandler().handleRequest(days);
            } else {
                return "请假天数太多，没有人批准";
            }
        }
    }
}
