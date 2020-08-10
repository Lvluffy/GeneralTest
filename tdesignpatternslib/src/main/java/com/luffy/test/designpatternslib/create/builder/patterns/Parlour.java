package com.luffy.test.designpatternslib.create.builder.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 客厅（产品角色）
 */
public class Parlour {
    private String wall;//墙
    private String tv;//电视
    private String sofa;//沙发

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "Parlour{" +
                "wall='" + wall + '\'' +
                ", tv='" + tv + '\'' +
                ", sofa='" + sofa + '\'' +
                '}';
    }
}
