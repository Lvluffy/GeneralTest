package com.luffy.test.android.ui.owner.animation.tweenAnimation;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-08-03
 *
 * @name 补间动画
 */
public class TweenAnimationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TweenAnimationFragment tweenAnimationFragment = new TweenAnimationFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, tweenAnimationFragment).commitAllowingStateLoss();
    }
}
