package com.luffy.test.tdesignpatternlib.behavior.observer.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 抽象目标：汇率
 */
public abstract class Rate {
    protected List<Company> companys = new ArrayList<Company>();

    /**
     * 增加观察者方法
     *
     * @param company
     */
    public void add(Company company) {
        companys.add(company);
    }

    /**
     * 删除观察者方法
     *
     * @param company
     */
    public void remove(Company company) {
        companys.remove(company);
    }

    public abstract String change(int number);
}
