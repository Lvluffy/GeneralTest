package com.luffy.test.android.ui.owner.animation.frameAnimation;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-07-31
 *
 * @name 帧动画
 */
public class AnimationDrawableActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new AnimationDrawableFragment());
    }
}
