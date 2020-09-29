package com.luffy.test.android.ui.owner.animation.entrance;

import com.luffy.test.android.ui.owner.animation.TransitionActivity;
import com.luffy.test.android.ui.owner.animation.frameAnimation.AnimationDrawableActivity;
import com.luffy.test.android.ui.owner.animation.tweenAnimation.TweenAnimationActivity;

/**
 * Created by lvlufei on 2020-08-03
 *
 * @name
 */
public enum AnimationModel {
    ANIMATION_FRAME("帧动画", AnimationDrawableActivity.class),
    ANIMATION_TWEEN("补间动画", TweenAnimationActivity.class),
    ANIMATION_TRANSITION("过渡动画", TransitionActivity.class);

    public String name;
    public Class mClass;

    AnimationModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }

}
