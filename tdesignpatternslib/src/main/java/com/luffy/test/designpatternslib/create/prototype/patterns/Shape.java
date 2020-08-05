package com.luffy.test.designpatternslib.create.prototype.patterns;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 形状
 */
public interface Shape extends Cloneable {
    /**
     * 拷贝
     *
     * @return
     */
    Object clone();

    /**
     * 计算面积
     *
     * @param parameters 参数（例如：圆的半径、正方形的边长、三角行的底和高等等）
     * @return
     */
    double countArea(double... parameters);
}
