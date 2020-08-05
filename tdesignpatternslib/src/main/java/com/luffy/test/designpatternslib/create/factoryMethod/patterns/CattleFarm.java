package com.luffy.test.designpatternslib.create.factoryMethod.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 牛场
 */
public class CattleFarm implements AnimalFarm {
    @Override
    public Animal createAnimal() {
        return new Cattle();
    }
}
