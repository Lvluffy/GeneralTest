package com.luffy.test.designpatternslib.structure.bridge.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 黄色（具体实现化角色）
 */
public class Yellow implements Color {
    @Override
    public String getColor() {
        return "黄色";
    }
}
