package com.luffy.test.android.ui.owner.service;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-08-26
 *
 * @name 服务启动
 */
public class ServiceStartActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new ServiceStartFragment());
    }
}
