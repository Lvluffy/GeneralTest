package com.luffy.test.tdesignpatternlib.behavior.iterator.patterns;

import java.util.ArrayList;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 具体聚合：婺源景点集
 */
public class WyViewSpotSet implements ViewSpotSet {
    private ArrayList<ViewSpot> list = new ArrayList<>();

    public void add(ViewSpot obj) {
        list.add(obj);
    }

    public void remove(ViewSpot obj) {
        list.remove(obj);
    }

    public ViewSpotIterator getIterator() {
        return (new WyViewSpotIterator(list));
    }
}
