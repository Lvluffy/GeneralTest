package com.luffy.test.designpatternslib.structure.facade.patterns;

import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产10-闻喜煮饼（子系统角色）
 */
public class Specialty10 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_10;
    }

    @Override
    public String getName() {
        return "闻喜煮饼";
    }
}
