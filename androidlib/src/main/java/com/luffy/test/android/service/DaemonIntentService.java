package com.luffy.test.android.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class DaemonIntentService extends IntentService {

    public DaemonIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
