package com.luffy.test.android.ui.module.broadCast;

import com.luffy.test.android.ui.module.broadCast.dynamicRegister.BroadCastDynamicRegisterActivity;
import com.luffy.test.android.ui.module.broadCast.staticRegister.BroadCastStaticRegisterActivity;

public enum BroadCastRegisterModel {

    DYNAMIC_REGISTER("动态注册广播", BroadCastDynamicRegisterActivity.class),
    STATIC_REGISTER("静态注册广播", BroadCastStaticRegisterActivity.class);

    public String name;
    public Class mClass;

    BroadCastRegisterModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
