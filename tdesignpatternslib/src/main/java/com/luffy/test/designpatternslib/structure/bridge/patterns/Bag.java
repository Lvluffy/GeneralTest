package com.luffy.test.designpatternslib.structure.bridge.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 包
 */
public abstract class Bag {
    private Color mColor;

    public Color getColor() {
        return mColor;
    }

    public void setColor(Color color) {
        this.mColor = color;
    }

    public abstract String getName();
}
