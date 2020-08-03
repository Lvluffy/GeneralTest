package com.luffy.test.android.ui.owner.dynamicAddView;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

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
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, dynamicAddViewFragment).commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        if (dynamicAddViewFragment.hasShowDynamicView()) {
            return;
        }
        super.onBackPressed();
    }

}
