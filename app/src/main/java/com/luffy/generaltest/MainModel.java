package com.luffy.generaltest;

import com.luffy.test.android.ui.owner.activityForResult.BankCardDetailActivity;
import com.luffy.test.android.ui.owner.animation.entrance.AnimationActivity;
import com.luffy.test.android.ui.owner.dynamicAddView.DynamicAddViewActivity;
import com.luffy.test.android.ui.owner.link.LinkActivity;
import com.luffy.test.android.ui.owner.nfc.NFCActivity;
import com.luffy.test.android.ui.owner.notification.NotificationActivity;
import com.luffy.test.android.ui.owner.pingNet.PingNetActivity;
import com.luffy.test.android.ui.owner.provider.ProviderActivity;
import com.luffy.test.android.ui.owner.receiver.RegisterReceiverActivity;
import com.luffy.test.android.ui.owner.rxjava.RxJavaActivity;
import com.luffy.test.android.ui.owner.service.ServiceStartActivity;
import com.luffy.test.android.ui.owner.settings.SettingsActivity;
import com.luffy.test.android.ui.owner.thread.entrance.ThreadActivity;
import com.luffy.test.android.ui.owner.vibrator.VibratorActivity;
import com.luffy.test.android.ui.tsm.feature.FeatureActivity;
import com.luffy.test.android.ui.tsm.multiCard.MultiCardActivity;
import com.luffy.test.tdesignpatternlib.DesignPatternsActivity;

public enum MainModel {

    OWNER_ACTIVITY_FOR_RESULT("activity数据传递", BankCardDetailActivity.class),
    OWNER_PROVIDER("访问内容提供者", ProviderActivity.class),
    OWNER_SERVICE("启动服务", ServiceStartActivity.class),
    OWNER_RXJAVA("RxJava", RxJavaActivity.class),
    OWNER_SETTINGS("系统属性", SettingsActivity.class),
    OWNER_DYNAMIC_ADD_VIEW("动态添加View", DynamicAddViewActivity.class),
    OWNER_APP_LINK("AppLink", LinkActivity.class),
    OWNER_ANIMATION_DRAWABLE("动画", AnimationActivity.class),
    OWNER_DESIGN_PATTERNS("设计模式", DesignPatternsActivity.class),
    OWNER_NOTIFICATION("通知", NotificationActivity.class),
    OWNER_THREAD("线程", ThreadActivity.class),
    OWNER_PING_NET("Ping网络检测", PingNetActivity.class),
    OWNER_VIBRATOR("震动", VibratorActivity.class),
    OWNER_NFC("NFC", NFCActivity.class),
    OWNER_REGISTER_RECEIVER("注册广播", RegisterReceiverActivity.class),
    TSM_FEATURE("TSM功能", FeatureActivity.class),
    TSM_MULTI_CARD("TMS双标卡", MultiCardActivity.class);

    public String name;
    public Class mClass;

    MainModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }

}
