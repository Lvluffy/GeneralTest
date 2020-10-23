package com.luffy.test.android.ui.module.receiver;

import com.luffy.test.android.ui.module.receiver.dynamicRegister.ReceiverDynamicRegisterActivity;
import com.luffy.test.android.ui.module.receiver.staticRegister.ReceiverStaticRegisterActivity;

public enum ReceiverRegisterModel {

    DYNAMIC_REGISTER("动态注册广播", ReceiverDynamicRegisterActivity.class),
    STATIC_REGISTER("静态注册广播", ReceiverStaticRegisterActivity.class);

    public String name;
    public Class mClass;

    ReceiverRegisterModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
