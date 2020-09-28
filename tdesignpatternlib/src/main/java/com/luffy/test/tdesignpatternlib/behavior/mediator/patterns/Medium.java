package com.luffy.test.tdesignpatternlib.behavior.mediator.patterns;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 抽象中介者：中介公司
 */
public interface Medium {
    /**
     * 客户注册
     *
     * @param member
     */
    void register(Customer member);

    /**
     * 转发
     *
     * @param from
     * @param ad
     */
    String relay(String from, String ad);
}
