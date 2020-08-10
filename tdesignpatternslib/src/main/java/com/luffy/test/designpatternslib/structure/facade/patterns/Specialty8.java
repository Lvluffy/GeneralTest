package com.luffy.test.designpatternslib.structure.facade.patterns;

import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产8-汾州核桃（子系统角色）
 */
public class Specialty8 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_8;
    }

    @Override
    public String getName() {
        return "汾州核桃";
    }
}
