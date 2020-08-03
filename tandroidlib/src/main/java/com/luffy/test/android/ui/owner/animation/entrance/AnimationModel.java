package com.luffy.test.android.ui.owner.animation.entrance;

import com.luffy.test.android.ui.owner.animation.AnimationDrawableActivity;
import com.luffy.test.android.ui.owner.animation.TransitionActivity;

/**
 * Created by lvlufei on 2020-08-03
 *
 * @name
 */
public enum AnimationModel {
    ANIMATION_ANIMATION_DRAWABLE("桢动画", AnimationDrawableActivity.class),
    ANIMATION_TRANSITION("过渡动画", TransitionActivity.class);

    private String name;
    private Class aClass;

    AnimationModel(String name, Class aClass) {
        this.name = name;
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public Class getaClass() {
        return aClass;
    }
}
