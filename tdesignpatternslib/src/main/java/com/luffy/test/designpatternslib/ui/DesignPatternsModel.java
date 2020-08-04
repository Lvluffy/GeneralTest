package com.luffy.test.designpatternslib.ui;

import com.luffy.test.designpatternslib.behavior.chainOfResponsibility.ui.ChainOfResponsibilityActivity;

public enum DesignPatternsModel {

    BEHAVIOR_CHAIN_OF_RESPONSIBILITY("责任链", ChainOfResponsibilityActivity.class);

    private String name;
    private Class aClass;

    DesignPatternsModel(String name, Class aClass) {
        this.name = name;
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public Class getaClass() {
        return aClass;
    }
}
