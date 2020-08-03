package com.luffy.test.android.ui.owner.animation;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-07-31
 *
 * @name 过渡动画
 */
public class TransitionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TransitionFragment transitionFragment = new TransitionFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, transitionFragment).commitAllowingStateLoss();
    }
}
