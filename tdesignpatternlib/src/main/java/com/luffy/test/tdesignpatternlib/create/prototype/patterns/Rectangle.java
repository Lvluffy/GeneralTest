package com.luffy.test.tdesignpatternlib.create.prototype.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 长方形（具体原型角色））
 */
public class Rectangle implements Shape {
    @Override
    public Object clone() {
        Rectangle rectangle = null;
        try {
            rectangle = (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("拷贝长方形失败!");
        }
        return rectangle;
    }

    @Override
    public double countArea(double... parameters) {
        if (parameters.length < 2) {
            return 0;
        }
        return parameters[0] * parameters[1];
    }
}
