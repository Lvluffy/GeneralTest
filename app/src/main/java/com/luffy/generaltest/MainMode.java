package com.luffy.generaltest;

import com.luffy.test.android.ui.owner.activityForResult.BankCardDetailActivity;
import com.luffy.test.android.ui.owner.animation.animationDrawable.AnimationDrawableActivity;
import com.luffy.test.android.ui.owner.dynamicAddView.DynamicAddViewActivity;
import com.luffy.test.android.ui.owner.handler.HandlerActivity;
import com.luffy.test.android.ui.owner.link.LinkActivity;
import com.luffy.test.android.ui.owner.provider.ProviderActivity;
import com.luffy.test.android.ui.owner.rxjava.RxJavaActivity;
import com.luffy.test.android.ui.owner.settings.SettingsActivity;
import com.luffy.test.android.ui.tsm.feature.FeatureActivity;
import com.luffy.test.android.ui.tsm.multiCard.MultiCardActivity;

public enum MainMode {

    OWNER_ACTIVITY_FOR_RESULT("activity数据传递", BankCardDetailActivity.class),
    OWNER_PROVIDER("测试内容提供者", ProviderActivity.class),
    OWNER_HANDLER("Handler", HandlerActivity.class),
    OWNER_RXJAVA("RxJava", RxJavaActivity.class),
    OWNER_SETTINGS("系统属性", SettingsActivity.class),
    OWNER_DYNAMIC_ADD_VIEW("动态添加View", DynamicAddViewActivity.class),
    OWNER_APP_LINK("AppLink", LinkActivity.class),
    OWNER_ANIMATION_DRAWABLE("可拉的动画", AnimationDrawableActivity.class),
    TSM_FEATURE("TSM功能", FeatureActivity.class),
    TSM_MULTI_CARD("TMS双标卡", MultiCardActivity.class);

    private String name;
    private Class aClass;

    MainMode(String name, Class aClass) {
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
