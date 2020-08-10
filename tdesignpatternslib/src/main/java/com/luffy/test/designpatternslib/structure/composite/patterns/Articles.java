package com.luffy.test.designpatternslib.structure.composite.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 物品（抽象构件）
 */
public interface Articles {
    /**
     * 计算
     *
     * @return
     */
    float calculation();

    /**
     * 显示
     *
     * @return
     */
    String show();
}
