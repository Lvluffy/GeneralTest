package com.luffy.test.tdesignpatternlib.structure.proxy.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 山西特产（真实主题角色）
 */
public class SxSpecialty implements Specialty {
    @Override
    public String display() {
        return "汾酒";
    }
}
