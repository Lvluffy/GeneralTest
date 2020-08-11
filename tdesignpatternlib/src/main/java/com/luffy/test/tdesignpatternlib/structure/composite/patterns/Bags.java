package com.luffy.test.tdesignpatternlib.structure.composite.patterns;

import java.util.ArrayList;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 袋子（树枝构件）
 */
public class Bags implements Articles {

    private ArrayList<Articles> bags = new ArrayList<>();

    public void add(Articles c) {
        bags.add(c);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((Articles) obj).calculation();
        }
        return s;
    }

    @Override
    public String show() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Articles articles : bags) {
            stringBuilder.append(articles.show());
        }
        return stringBuilder.toString();
    }
}
