package com.luffy.test.designpatternslib.ui;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 设计模式
 */
public class DesignPatternsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new DesignPatternsFragment());
    }
}
