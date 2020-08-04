package com.luffy.test.android.ui.owner.handler;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 处理者
 */
public class HandlerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new HandlerFragment());
    }
}
