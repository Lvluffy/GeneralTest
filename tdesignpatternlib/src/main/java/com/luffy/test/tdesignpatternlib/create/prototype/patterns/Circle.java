package com.luffy.test.tdesignpatternlib.create.prototype.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 圆（具体原型角色））
 */
public class Circle implements Shape {
    @Override
    public Object clone() {
        Circle circle = null;
        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("拷贝圆失败!");
        }
        return circle;
    }

    @Override
    public double countArea(double... parameters) {
        if (parameters.length == 0) {
            return 0;
        }
        return 3.1415 * Math.pow(parameters[0], 2);
    }

}
