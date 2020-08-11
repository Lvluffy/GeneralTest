package com.luffy.test.tdesignpatternlib.structure.facade.patterns;

import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产7-竹叶青酒（子系统角色）
 */
public class Specialty7 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_7;
    }

    @Override
    public String getName() {
        return "竹叶青酒";
    }
}
