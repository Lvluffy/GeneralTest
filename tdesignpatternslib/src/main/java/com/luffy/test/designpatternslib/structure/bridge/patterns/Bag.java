package com.luffy.test.designpatternslib.structure.bridge.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 包（抽象化角色）
 */
public abstract class Bag {
    private Color mColor;

    public Bag(Color color) {
        this.mColor = color;
    }

    public Color getColor() {
        return mColor;
    }

    public abstract String getName();
}
