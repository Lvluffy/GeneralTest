package com.luffy.test.android.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 测试-意图服务
 */
public class TestIntentService extends IntentService {

    public TestIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
