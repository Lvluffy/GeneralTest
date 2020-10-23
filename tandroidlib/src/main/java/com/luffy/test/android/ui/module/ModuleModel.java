package com.luffy.test.android.ui.module;

import com.luffy.test.android.ui.module.activityForResult.BankCardDetailActivity;
import com.luffy.test.android.ui.module.provider.ProviderActivity;
import com.luffy.test.android.ui.module.receiver.ReceiverRegisterActivity;
import com.luffy.test.android.ui.module.service.ServiceStartActivity;

public enum ModuleModel {

    MODULE_ACTIVITY_FOR_RESULT("activity数据传递", BankCardDetailActivity.class),
    MODULE_PROVIDER("访问内容提供者", ProviderActivity.class),
    MODULE_SERVICE("启动服务", ServiceStartActivity.class),
    MODULE_REGISTER_RECEIVER("注册广播", ReceiverRegisterActivity.class);

    public String name;
    public Class mClass;

    ModuleModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
