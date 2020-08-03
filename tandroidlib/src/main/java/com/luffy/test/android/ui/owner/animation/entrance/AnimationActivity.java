package com.luffy.test.android.ui.owner.animation.entrance;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-08-03
 *
 * @name 动画
 */
public class AnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnimationFragment animationFragment = new AnimationFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, animationFragment).commitAllowingStateLoss();
    }
}
