package com.luffy.test.android.ui.ipc.activity;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-10-23
 *
 * @name 跨进程通讯-Activity
 */
public class IPCActivityActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new IPCActivityFragment());
    }
}
