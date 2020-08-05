package com.luffy.test.designpatternslib.create.factoryMethod.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 马场
 */
public class HorseFarm implements AnimalFarm {
    @Override
    public Animal createAnimal() {
        return new Horse();
    }
}
