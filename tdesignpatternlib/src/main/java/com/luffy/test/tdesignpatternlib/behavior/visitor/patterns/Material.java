package com.luffy.test.tdesignpatternlib.behavior.visitor.patterns;

/**
 * Created by lvlufei on 2020-10-10
 *
 * @name 抽象元素：材料
 */
public interface Material {
    /**
     * 接受
     *
     * @param visitor
     * @return
     */
    String accept(Company visitor);
}
