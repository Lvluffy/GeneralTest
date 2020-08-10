package com.luffy.test.designpatternslib.structure.decorator.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 都市丽人（具体装饰角色）
 */
public class CityBeauty extends Changer {

    public CityBeauty(Belle belle) {
        super(belle);
    }

    @Override
    public String display() {
        return change();
    }

    @Override
    public String change() {
        return "都市丽人装";
    }
}
