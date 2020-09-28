package com.luffy.test.tdesignpatternlib.behavior.mediator.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2020-09-28
 *
 * @name 具体中介者：房地产中介
 */
public class EstateMedium implements Medium {

    private List<Customer> members = new ArrayList<>();

    @Override
    public void register(Customer member) {
        members.add(member);
        member.setMedium(this);
    }

    @Override
    public String relay(String from, String ad) {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : members) {
            String name = customer.getName();
            if (!name.equals(from)) {
                sb.append(customer.receive(from, ad));
            }
        }
        return sb.toString();
    }
}
