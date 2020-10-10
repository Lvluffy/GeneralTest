package com.luffy.test.tdesignpatternlib.behavior.visitor.patterns;

/**
 * Created by lvlufei on 2020-10-10
 *
 * @name 抽象访问者：公司
 */
public interface Company {
    String create(Paper element);

    String create(Cuprum element);
}
