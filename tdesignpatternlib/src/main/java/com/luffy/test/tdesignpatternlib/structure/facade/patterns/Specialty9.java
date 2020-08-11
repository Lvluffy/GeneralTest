package com.luffy.test.tdesignpatternlib.structure.facade.patterns;

import com.luffy.test.tdesignpatternlib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产9-蒲州青柿（子系统角色）
 */
public class Specialty9 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_9;
    }

    @Override
    public String getName() {
        return "蒲州青柿";
    }
}
