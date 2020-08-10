package com.luffy.test.designpatternslib.structure.facade.patterns;

import com.luffy.test.designpatternslib.R;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 特产2-山西老陈醋（子系统角色）
 */
public class Specialty2 implements ImageIcon {
    @Override
    public int getImage() {
        return R.drawable.facade_2;
    }

    @Override
    public String getName() {
        return "山西老陈醋";
    }
}
