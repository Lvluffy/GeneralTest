package com.luffy.test.tdesignpatternlib.behavior.observer.patterns;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 具体的观察者：出口公司
 */
public class ExportCompany implements Company {
    @Override
    public String response(int number) {
        StringBuilder sb = new StringBuilder();
        if (number > 0) {
            sb.append("人民币汇率升值").append(number).append("个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        } else if (number < 0) {
            sb.append("人民币汇率贬值").append(-number).append("个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
        return sb.toString();
    }
}
