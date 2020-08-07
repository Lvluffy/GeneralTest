package com.luffy.test.designpatternslib.structure.proxy.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 太原代理商
 */
public class TyProxy implements Specialty {

    private SxSpecialty realSubject = new SxSpecialty();

    @Override
    public String display() {
        return "太原代理山西特产:" + realSubject.display();
    }

    /**
     * 种类
     *
     * @return¬¬
     */
    public FenChiewKind[] kind() {
        return FenChiewKind.values();
    }

}
