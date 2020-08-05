package com.luffy.test.designpatternslib.create.factoryMethod.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 畜牧场
 */
public interface AnimalFarm {

    /**
     * 创建动物
     *
     * @return
     */
    Animal createAnimal();

}
