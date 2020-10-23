package com.luffy.test.android.ui.owner;

import com.luffy.test.android.ui.owner.animation.entrance.AnimationActivity;
import com.luffy.test.android.ui.owner.dynamicAddView.DynamicAddViewActivity;
import com.luffy.test.android.ui.owner.link.LinkActivity;
import com.luffy.test.android.ui.owner.nfc.NFCActivity;
import com.luffy.test.android.ui.owner.notification.NotificationActivity;
import com.luffy.test.android.ui.owner.pingNet.PingNetActivity;
import com.luffy.test.android.ui.owner.rxjava.RxJavaActivity;
import com.luffy.test.android.ui.owner.settings.SettingsActivity;
import com.luffy.test.android.ui.owner.thread.entrance.ThreadActivity;
import com.luffy.test.android.ui.owner.vibrator.VibratorActivity;

public enum OwnerModel {

    OWNER_RXJAVA("RxJava", RxJavaActivity.class),
    OWNER_SETTINGS("系统属性", SettingsActivity.class),
    OWNER_DYNAMIC_ADD_VIEW("动态添加View", DynamicAddViewActivity.class),
    OWNER_APP_LINK("AppLink", LinkActivity.class),
    OWNER_ANIMATION_DRAWABLE("动画", AnimationActivity.class),
    OWNER_NOTIFICATION("通知", NotificationActivity.class),
    OWNER_THREAD("线程", ThreadActivity.class),
    OWNER_PING_NET("Ping网络检测", PingNetActivity.class),
    OWNER_VIBRATOR("震动", VibratorActivity.class),
    OWNER_NFC("NFC", NFCActivity.class);

    public String name;
    public Class mClass;

    OwnerModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
