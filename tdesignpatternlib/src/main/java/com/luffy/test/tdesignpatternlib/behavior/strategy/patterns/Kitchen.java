package com.luffy.test.tdesignpatternlib.behavior.strategy.patterns;

/**
 * Created by lvlufei on 2020-08-11
 *
 * @name 厨房（环境角色）
 */
public class Kitchen {
    private CrabCooking crabCooking;

    public Kitchen(CrabCooking crabCooking) {
        this.crabCooking = crabCooking;
    }

    public String cookingMethod() {
        if (crabCooking == null) {
            return null;
        }
        return crabCooking.cookingMethod();
    }

    public int getImage() {
        if (crabCooking == null) {
            return 0;
        }
        return crabCooking.image();
    }
}
