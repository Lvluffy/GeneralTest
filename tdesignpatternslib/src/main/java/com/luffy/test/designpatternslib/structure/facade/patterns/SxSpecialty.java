package com.luffy.test.designpatternslib.structure.facade.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2020-08-10
 *
 * @name 山西特产（外观角色）
 */
public class SxSpecialty {

    private Specialty1 specialty1;
    private Specialty2 specialty2;
    private Specialty3 specialty3;
    private Specialty4 specialty4;
    private Specialty5 specialty5;
    private Specialty6 specialty6;
    private Specialty7 specialty7;
    private Specialty8 specialty8;
    private Specialty9 specialty9;
    private Specialty10 specialty10;

    private List<ImageIcon> list = new ArrayList<>();

    public SxSpecialty() {
        specialty1 = new Specialty1();
        specialty2 = new Specialty2();
        specialty3 = new Specialty3();
        specialty4 = new Specialty4();
        specialty5 = new Specialty5();
        specialty6 = new Specialty6();
        specialty7 = new Specialty7();
        specialty8 = new Specialty8();
        specialty9 = new Specialty9();
        specialty10 = new Specialty10();

        list.add(specialty1);
        list.add(specialty2);
        list.add(specialty3);
        list.add(specialty4);
        list.add(specialty5);
        list.add(specialty6);
        list.add(specialty7);
        list.add(specialty8);
        list.add(specialty9);
        list.add(specialty10);
    }

    public List<ImageIcon> getList() {
        return list;
    }
}
