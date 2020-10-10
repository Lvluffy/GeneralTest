package com.luffy.test.tdesignpatternlib.behavior.visitor.patterns;
/**
 * Created by lvlufei on 2020-10-10
 *
 * @name 具体访问者：艺术公司
 */
public class ArtCompany implements Company {
    @Override
    public String create(Paper element) {
        return "讲学图";
    }

    @Override
    public String create(Cuprum element) {
        return "朱熹铜像";
    }
}
