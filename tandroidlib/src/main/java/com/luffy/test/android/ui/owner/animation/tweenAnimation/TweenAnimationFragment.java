package com.luffy.test.android.ui.owner.animation.tweenAnimation;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-03
 *
 * @name 补间动画
 */
public class TweenAnimationFragment extends BaseFragment {

    @BindView(R2.id.img_xml)
    ImageView imgXml;
    @BindView(R2.id.view_root)
    FrameLayout viewRoot;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tween_animation, container, false);
    }

    @OnClick({R2.id.btn_translate,
            R2.id.btn_scale,
            R2.id.btn_rotate,
            R2.id.btn_alpha,
            R2.id.btn_set})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_translate) {
            transelate();
        } else if (id == R.id.btn_scale) {
            scale();
        } else if (id == R.id.btn_rotate) {
            rotate();
        } else if (id == R.id.btn_alpha) {
            alpha();
        } else if (id == R.id.btn_set) {
            set();
        }
    }

    private void transelate() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 300);
        translateAnimation.setFillAfter(true);
        translateAnimation.setDuration(2000);
        imgXml.startAnimation(translateAnimation);
    }

    private void scale() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(2000);
        imgXml.startAnimation(scaleAnimation);
    }

    private void rotate() {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360f);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(2000);
        imgXml.startAnimation(rotateAnimation);
    }

    private void alpha() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(2000);
        imgXml.startAnimation(alphaAnimation);
    }

    private void set() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 300);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 2, 1, 2);
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360f);

        AnimationSet animationSet = new AnimationSet(true);

        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);

        animationSet.setFillAfter(true);
        animationSet.setDuration(2000);
        imgXml.startAnimation(animationSet);
    }

}
