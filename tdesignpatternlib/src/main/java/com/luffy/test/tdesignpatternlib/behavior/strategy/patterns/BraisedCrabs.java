package com.luffy.test.tdesignpatternlib.behavior.strategy.patterns;

import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-11
 *
 * @name 红烧大闸蟹（具体策略角色）
 */
public class BraisedCrabs implements CrabCooking {
    @Override
    public String cookingMethod() {
        return "红烧大闸蟹";
    }

    @Override
    public int image() {
        return R.drawable.strategy_braised_crabs;
    }
}
