package com.luffy.test.tdesignpatternlib.behavior.observer.patterns;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 具体的目标：人名币汇率
 */
public class RMBRate extends Rate {
    @Override
    public String change(int number) {
        StringBuilder sb = new StringBuilder();
        for (Company company : companys) {
            sb.append(company.response(number));
        }
        return sb.toString();
    }
}
