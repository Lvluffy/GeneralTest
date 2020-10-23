package com.luffy.test.android.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 测试-动态广播接收者
 */
public class TestDynamicReceiver extends BroadcastReceiver {

    public static final String ACTION = "com.luffy.test.android.receiver.TestDynamicReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, intent.getStringExtra("data"), Toast.LENGTH_SHORT).show();
    }
}
