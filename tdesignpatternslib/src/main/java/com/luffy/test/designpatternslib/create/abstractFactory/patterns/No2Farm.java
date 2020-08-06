package com.luffy.test.designpatternslib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 2号农场（用于养牛和种水果）
 */
public class No2Farm implements Farm {
    @Override
    public String name() {
        return "2号农场";
    }

    @Override
    public Animal createAnimal() {
        return new Horse();
    }

    @Override
    public Plant createPlant() {
        return new Fruit();
    }
}
