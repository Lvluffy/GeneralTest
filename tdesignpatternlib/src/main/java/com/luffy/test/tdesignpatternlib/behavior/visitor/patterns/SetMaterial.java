package com.luffy.test.tdesignpatternlib.behavior.visitor.patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lvlufei on 2020-10-10
 *
 * @name 对象结构角色:材料集
 */
public class SetMaterial {
    private List<Material> list = new ArrayList<>();

    public String accept(Company visitor) {
        Iterator<Material> i = list.iterator();
        String tmp = "";
        while (i.hasNext()) {
            tmp += i.next().accept(visitor) + " ";
        }
        return tmp; //返回某公司的作品集
    }

    public void add(Material element) {
        list.add(element);
    }

    public void remove(Material element) {
        list.remove(element);
    }
}
