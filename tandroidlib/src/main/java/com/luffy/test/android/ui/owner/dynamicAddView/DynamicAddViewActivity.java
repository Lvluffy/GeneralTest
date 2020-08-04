package com.luffy.test.android.ui.owner.dynamicAddView;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-07-21
 *
 * @name 动态添加View
 */
public class DynamicAddViewActivity extends BaseActivity {

    private DynamicAddViewFragment dynamicAddViewFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dynamicAddViewFragment = new DynamicAddViewFragment();
        FragmentUtils.getInstance().replaceFragment(this, dynamicAddViewFragment);
    }

    @Override
    public void onBackPressed() {
        if (dynamicAddViewFragment.hasShowDynamicView()) {
            return;
        }
        super.onBackPressed();
    }

}
