package com.luffy.test.android.ui.owner.animation;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-31
 *
 * @name 桢动画
 */
public class AnimationDrawableFragment extends BaseFragment {

    @BindView(R2.id.img)
    ImageView img;

    private AnimationDrawable mAnimationDrawable;
    private AnimationDrawable mTapPosDrawable;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animation_drawable, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAnimationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.finger_print_drawable, null);
        mTapPosDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.tap_pos_drawable, null);
    }

    @OnClick({R2.id.btn})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn) {
            mAnimationDrawable.stop();
            mTapPosDrawable.stop();
            img.setImageDrawable(mAnimationDrawable);
            mAnimationDrawable.start();
            mAnimationDrawable.addFrame(mTapPosDrawable, 100);
        }
    }
}
