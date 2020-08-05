package com.luffy.test.designpatternslib.create.prototype.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 正方形
 */
public class Square implements Shape {
    @Override
    public Object clone() {
        Square square = null;
        try {
            square = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("拷贝正方形失败!");
        }
        return square;
    }

    @Override
    public double countArea(double... parameters) {
        if (parameters.length == 0) {
            return 0;
        }
        return Math.pow(parameters[0], 2);
    }
}
