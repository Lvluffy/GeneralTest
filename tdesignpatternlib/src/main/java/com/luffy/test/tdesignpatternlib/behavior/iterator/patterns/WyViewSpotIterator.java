package com.luffy.test.tdesignpatternlib.behavior.iterator.patterns;

import java.util.ArrayList;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 具体迭代器：婺源景点迭代器
 */
public class WyViewSpotIterator implements ViewSpotIterator {
    private ArrayList<ViewSpot> list;
    private int index = -1;
    ViewSpot obj = null;

    public WyViewSpotIterator(ArrayList<ViewSpot> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ViewSpot first() {
        index = 0;
        obj = list.get(index);
        return obj;
    }

    @Override
    public ViewSpot previous() {
        if (index > 0) {
            obj = list.get(--index);
        }
        return obj;
    }

    @Override
    public ViewSpot next() {
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public ViewSpot last() {
        index = list.size() - 1;
        obj = list.get(index);
        return obj;
    }
}
