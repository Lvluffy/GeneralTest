package com.luffy.test.tdesignpatternlib.behavior.observer.patterns;

/**
 * Created by lvlufei on 2020-09-27
 *
 * @name 具体的观察者：进口公司
 */
public class ImportCompany implements Company {
    @Override
    public String response(int number) {
        StringBuilder sb = new StringBuilder();
        if (number > 0) {
            sb.append("人民币汇率升值").append(number).append("个基点，降低了进口产品成本，提升了进口公司利润率。");
        } else if (number < 0) {
            sb.append("人民币汇率贬值").append(-number).append("个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
        return sb.toString();
    }
}
