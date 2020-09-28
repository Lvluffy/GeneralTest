package com.luffy.test.tdesignpatternlib.behavior.iterator.patterns;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 抽象迭代器：景点迭代器接口
 */
public interface ViewSpotIterator {
    boolean hasNext();

    ViewSpot first();

    ViewSpot previous();

    ViewSpot next();

    ViewSpot last();
}
