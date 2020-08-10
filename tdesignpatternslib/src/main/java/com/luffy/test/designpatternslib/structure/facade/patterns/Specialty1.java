package com.luffy.test.designpatternslib.structure.facade.patterns;

import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产1-平遥牛肉（子系统角色）
 */
public class Specialty1 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_1;
    }

    @Override
    public String getName() {
        return "平遥牛肉";
    }
}
