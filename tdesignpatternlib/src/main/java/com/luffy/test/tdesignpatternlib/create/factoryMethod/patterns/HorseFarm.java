package com.luffy.test.tdesignpatternlib.create.factoryMethod.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 马场（具体工厂角色）
 */
public class HorseFarm implements AnimalFarm {
    @Override
    public Animal createAnimal() {
        return new Horse();
    }
}
