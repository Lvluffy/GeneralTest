package com.luffy.test.tdesignpatternlib.structure.decorator.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 美女原身（具体构建角色）
 */
public class Original implements Belle {
    @Override
    public String display() {
        return setImage();
    }

    public String setImage() {
        return "美女原身";
    }
}
