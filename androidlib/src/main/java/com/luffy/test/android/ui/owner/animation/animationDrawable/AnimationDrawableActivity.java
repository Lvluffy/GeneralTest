package com.luffy.test.android.ui.owner.animation.animationDrawable;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-07-31
 *
 * @name 可拉的动画
 */
public class AnimationDrawableActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnimationDrawableFragment animationDrawableFragment = new AnimationDrawableFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, animationDrawableFragment).commitAllowingStateLoss();
    }
}
