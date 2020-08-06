package com.luffy.test.designpatternslib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 农场
 */
public interface Farm {

    /**
     * 农场名字
     *
     * @return
     */
    String name();

    /**
     * 创建动物
     *
     * @return
     */
    Animal createAnimal();

    /**
     * 创建植物
     *
     * @return
     */
    Plant createPlant();
}
