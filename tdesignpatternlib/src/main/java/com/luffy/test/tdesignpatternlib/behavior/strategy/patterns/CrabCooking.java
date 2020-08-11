package com.luffy.test.tdesignpatternlib.behavior.strategy.patterns;

/**
 * Created by lvlufei on 2020-08-11
 *
 * @name 大闸蟹烹饪（抽象策略角色）
 */
public interface CrabCooking {
    /**
     * 烹饪方法
     *
     * @return
     */
    String cookingMethod();

    /**
     * 图片
     *
     * @return
     */
    int image();
}
