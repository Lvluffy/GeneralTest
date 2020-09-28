package com.luffy.test.tdesignpatternlib.behavior.iterator.patterns;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 景点类
 */
public class ViewSpot {
    private String name;
    private String introduce;

    public ViewSpot(String Name, String Introduce) {
        this.name = Name;
        this.introduce = Introduce;
    }

    public String getName() {
        return name;
    }

    public String getIntroduce() {
        return introduce;
    }
}
