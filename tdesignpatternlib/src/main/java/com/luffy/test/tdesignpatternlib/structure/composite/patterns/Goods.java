package com.luffy.test.tdesignpatternlib.structure.composite.patterns;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 商品（树叶构件）
 */
public class Goods implements Articles {

    private String name;     //名字
    private int quantity;    //数量
    private float unitPrice; //单价

    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public String show() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name)
                .append("(数量:")
                .append(quantity)
                .append(",单价:")
                .append(unitPrice)
                .append("元)")
                .append("\n");
        return stringBuilder.toString();
    }
}
