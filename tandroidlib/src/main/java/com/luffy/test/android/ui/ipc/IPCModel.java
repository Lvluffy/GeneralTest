package com.luffy.test.android.ui.ipc;

import com.luffy.test.android.ui.ipc.activity.IPCActivityActivity;
import com.luffy.test.android.ui.ipc.broadcast.IPCBroadCastActivity;
import com.luffy.test.android.ui.ipc.contentProvider.IPCContentProviderActivity;
import com.luffy.test.android.ui.ipc.service.IPCServiceActivity;

public enum IPCModel {

    IPC_ACTIVITY("Activity", IPCActivityActivity.class),
    IPC_PROVIDER("内容提供者", IPCContentProviderActivity.class),
    IPC_SERVICE("服务", IPCServiceActivity.class),
    IPC_BROADCAST("广播", IPCBroadCastActivity.class);

    public String name;
    public Class mClass;

    IPCModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
