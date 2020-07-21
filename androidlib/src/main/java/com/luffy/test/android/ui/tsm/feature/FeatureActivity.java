package com.luffy.test.android.ui.tsm.feature;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.WindowManager;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name TSM功能
 */
public class FeatureActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //透明状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //绑定布局
        FeatureFragment mFeatureFragment = new FeatureFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, mFeatureFragment).commitAllowingStateLoss();
    }

}
