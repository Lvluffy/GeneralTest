package com.luffy.test.tdesignpatternlib.create.prototype.patterns;

import java.util.HashMap;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 图形-原型管理者
 */
public class ShapePrototypeManager {

    public static final String KEY_CIRCLE = "Circle";//圆
    public static final String KEY_SQUARE = "Square";//正方形
    public static final String KEY_RECTANGLE = "Rectangle";//长方形
    public static final String KEY_TRIANGLE = "Triangle";//三角形

    private HashMap<String, Shape> mShapes = new HashMap<>();

    public ShapePrototypeManager() {
        mShapes.put(KEY_CIRCLE, new Circle());
        mShapes.put(KEY_SQUARE, new Square());
        mShapes.put(KEY_RECTANGLE, new Rectangle());
        mShapes.put(KEY_TRIANGLE, new Triangle());
    }

    public void addShape(String key, Shape shape) {
        mShapes.put(key, shape);
    }

    public Shape getShape(String key) {
        Shape shape = mShapes.get(key);
        if (shape != null) {
            return (Shape) shape.clone();
        }
        return null;
    }
}
