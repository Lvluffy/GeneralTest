package com.luffy.test.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 测试-服务
 */
public class TestService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
