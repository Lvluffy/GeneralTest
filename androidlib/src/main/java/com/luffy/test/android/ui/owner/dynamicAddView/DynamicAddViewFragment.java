package com.luffy.test.android.ui.owner.dynamicAddView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-21
 *
 * @name 动态添加View
 */
public class DynamicAddViewFragment extends BaseFragment {

    private FrameLayout mDecorView;
    private View mDynamicView;
    private boolean hasShowDynamicView;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dynamic_add_view, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mDecorView = mActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        mDynamicView = LayoutInflater.from(mActivity).inflate(R.layout.view_dynamic_add, null);
    }

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        displaySearchView();
    }

    public boolean hasShowDynamicView() {
        if (hasShowDynamicView) {
            hideSearchView();
            return true;
        }
        return false;
    }

    private void displaySearchView() {
        if (mDecorView == null || mDecorView == null || mDynamicView.getParent() != null) {
            return;
        }
        mDynamicView.clearAnimation();
        Animation animation = AnimationUtils.loadAnimation(mActivity, R.anim.anim_bottom_enter);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                hasShowDynamicView = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mDynamicView.setAnimation(animation);
        mDecorView.addView(mDynamicView);

    }

    private void hideSearchView() {
        if (mDecorView == null || mDecorView == null || mDynamicView.getParent() == null) {
            return;
        }
        mDynamicView.clearAnimation();
        Animation animation = AnimationUtils.loadAnimation(mActivity, R.anim.anim_bottom_exit);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                hasShowDynamicView = false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        mDynamicView.setAnimation(animation);
        mDecorView.removeView(mDynamicView);
    }
}
