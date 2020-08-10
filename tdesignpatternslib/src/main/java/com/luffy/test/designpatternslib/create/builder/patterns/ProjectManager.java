package com.luffy.test.designpatternslib.create.builder.patterns;

/**
 * Created by lvlufei on 2020-08-07
 *
 * @name 项目经理（指挥者角色）
 */
public class ProjectManager {

    private Decorator builder;

    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }

    /**
     * 装饰（产品构建与组装方法）
     *
     * @return
     */
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
