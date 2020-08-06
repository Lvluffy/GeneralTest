package com.luffy.test.designpatternslib.create.abstractFactory.patterns;

/**
 * Created by lvlufei on 2020-08-06
 *
 * @name 1号农场（用于养牛和种菜）
 */
public class No1Farm implements Farm {
    @Override
    public String name() {
        return "1号农场";
    }

    @Override
    public Animal createAnimal() {
        return new Cattle();
    }

    @Override
    public Plant createPlant() {
        return new Vegetable();
    }
}
