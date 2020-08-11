package com.luffy.test.tdesignpatternlib.structure.bridge.patterns;
/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 红色（具体实现化角色）
 */
public class Red implements Color {
    @Override
    public String getColor() {
        return "红色";
    }
}
