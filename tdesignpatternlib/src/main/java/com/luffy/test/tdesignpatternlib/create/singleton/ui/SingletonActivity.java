package com.luffy.test.tdesignpatternlib.create.singleton.ui;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 单例
 */
public class SingletonActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new SingletonFragment());
    }
}
