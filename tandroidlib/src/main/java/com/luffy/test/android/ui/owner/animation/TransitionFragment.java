package com.luffy.test.android.ui.owner.animation;

import android.os.Build;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-31
 *
 * @name 过渡动画
 */
public class TransitionFragment extends BaseFragment {

    @BindView(R2.id.img_view_attribute)
    ImageView imgViewAttribute;
    @BindView(R2.id.view_root)
    FrameLayout viewRoot;
    @BindView(R2.id.img_xml)
    ImageView imgXml;

    boolean toggle = true;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_transition, container, false);
    }

    @OnClick({R2.id.btn_view_attribute, R2.id.btn_xml})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_view_attribute) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                TransitionManager.beginDelayedTransition((ViewGroup) imgViewAttribute.getParent());
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imgViewAttribute.getLayoutParams();
            switch (layoutParams.gravity) {
                case Gravity.RIGHT:
                    layoutParams.gravity = Gravity.LEFT;
                    break;
                default:
                    layoutParams.gravity = Gravity.RIGHT;
                    break;
            }
            imgViewAttribute.setLayoutParams(layoutParams);
            imgViewAttribute.requestLayout();
        } else if (id == R.id.btn_xml) {
            Scene startScene = null;
            Scene endScene = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                startScene = Scene.getSceneForLayout(viewRoot, R.layout.layout_transition_start, mActivity);
                endScene = Scene.getSceneForLayout(viewRoot, R.layout.layout_transition_end, mActivity);
                if (toggle) {
                    TransitionManager.go(endScene, new ChangeBounds());
                } else {
                    TransitionManager.go(startScene, new ChangeBounds());
                }
            }
            toggle = !toggle;
        }
    }

}
