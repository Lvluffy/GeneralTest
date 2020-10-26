package com.luffy.test.android.ui.ipc.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.luffy.test.android.ui.module.ModuleActivity;
import com.luffy.utils.generallib.AppUtils;

public class IpcBroadCast extends BroadcastReceiver {

    public static final String ACTION = "com.luffy.test.android.ui.ipc.broadcast.IpcBroadCast";

    @Override
    public void onReceive(Context context, Intent intent) {
        intent.setClass(context, ModuleActivity.class);
        intent.setPackage(AppUtils.getInstance().getAppPackName(context));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}