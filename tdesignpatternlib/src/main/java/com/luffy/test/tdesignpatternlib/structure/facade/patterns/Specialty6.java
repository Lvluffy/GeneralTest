package com.luffy.test.tdesignpatternlib.structure.facade.patterns;

import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产6-太谷壶瓶枣（子系统角色）
 */
public class Specialty6 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_6;
    }

    @Override
    public String getName() {
        return "太谷壶瓶枣";
    }
}
