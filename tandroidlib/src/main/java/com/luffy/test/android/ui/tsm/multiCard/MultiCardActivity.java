package com.luffy.test.android.ui.tsm.multiCard;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-07-03
 *
 * @name 双标卡
 */
public class MultiCardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MultiCardFragment mMultiCardFragment = new MultiCardFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, mMultiCardFragment).commitAllowingStateLoss();
    }

}
