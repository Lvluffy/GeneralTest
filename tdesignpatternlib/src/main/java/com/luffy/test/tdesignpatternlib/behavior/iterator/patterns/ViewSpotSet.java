package com.luffy.test.tdesignpatternlib.behavior.iterator.patterns;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 抽象聚合：景点集接口
 */
public interface ViewSpotSet {
    void add(ViewSpot obj);

    void remove(ViewSpot obj);

    ViewSpotIterator getIterator();
}
