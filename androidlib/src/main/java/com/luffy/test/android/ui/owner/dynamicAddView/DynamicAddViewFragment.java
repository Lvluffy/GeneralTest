package com.luffy.test.android.ui.owner.dynamicAddView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        mDecorView = mActivity.getWindow().getDecorView().findViewById(android.R.id.content);
        mDynamicView = LayoutInflater.from(mActivity).inflate(R.layout.view_dynamic_add, null);
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
        if (mDecorView == null || mDecorView == null) {
            return;
        }
        mDynamicView.clearAnimation();
        mDynamicView.setAnimation(AnimationUtils.loadAnimation(mActivity, R.anim.anim_bottom_enter));
        mDecorView.addView(mDynamicView);
        hasShowDynamicView = true;
    }

    private void hideSearchView() {
        if (mDecorView == null || mDecorView == null) {
            return;
        }
        mDynamicView.clearAnimation();
        mDynamicView.setAnimation(AnimationUtils.loadAnimation(mActivity, R.anim.anim_bottom_exit));
        mDecorView.removeView(mDynamicView);
        hasShowDynamicView = false;
    }
}
