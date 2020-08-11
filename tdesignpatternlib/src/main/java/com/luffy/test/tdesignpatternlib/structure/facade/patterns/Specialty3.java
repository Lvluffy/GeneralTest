package com.luffy.test.tdesignpatternlib.structure.facade.patterns;

import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产3-汾酒（子系统角色）
 */
public class Specialty3 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_3;
    }

    @Override
    public String getName() {
        return "汾酒";
    }
}
