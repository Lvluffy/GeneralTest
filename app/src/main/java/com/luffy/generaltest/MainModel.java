package com.luffy.generaltest;

import com.luffy.test.android.ui.ipc.IPCActivity;
import com.luffy.test.android.ui.module.ModuleActivity;
import com.luffy.test.android.ui.owner.OwnerActivity;
import com.luffy.test.android.ui.tsm.TSMActivity;
import com.luffy.test.tdesignpatternlib.DesignPatternsActivity;

public enum MainModel {

    Module("组件", ModuleActivity.class),
    DESIGN_PATTERNS("设计模式", DesignPatternsActivity.class),
    IPC("跨进程通讯", IPCActivity.class),
    OWNER("所有者", OwnerActivity.class),
    TSM("TSM", TSMActivity.class);

    public String name;
    public Class mClass;

    MainModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }

}
