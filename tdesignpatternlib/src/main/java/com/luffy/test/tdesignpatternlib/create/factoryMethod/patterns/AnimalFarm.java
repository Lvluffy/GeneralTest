package com.luffy.test.tdesignpatternlib.create.factoryMethod.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 畜牧场（抽象工厂角色）
 */
public interface AnimalFarm {

    /**
     * 创建动物
     *
     * @return
     */
    Animal createAnimal();

}
