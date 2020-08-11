package com.luffy.test.tdesignpatternlib.structure.facade.patterns;

import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产5-交城骏枣（子系统角色）
 */
public class Specialty5 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_5;
    }

    @Override
    public String getName() {
        return "交城骏枣";
    }
}
