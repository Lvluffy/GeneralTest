package com.luffy.test.designpatternslib.structure.facade.patterns;

import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产4-广灵豆腐干（子系统角色）
 */
public class Specialty4 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_4;
    }

    @Override
    public String getName() {
        return "广灵豆腐干";
    }
}
