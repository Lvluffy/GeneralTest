package com.luffy.test.designpatternslib.create.prototype.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 三角形（具体原型角色））
 */
public class Triangle implements Shape {
    @Override
    public Object clone() {
        Triangle triangle = null;
        try {
            triangle = (Triangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("拷贝三角形失败!");
        }
        return triangle;
    }

    @Override
    public double countArea(double... parameters) {
        if (parameters.length < 2) {
            return 0;
        }
        return parameters[0] * parameters[1] / 2;
    }
}
