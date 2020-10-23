package com.luffy.test.android.ui.tsm;

import com.luffy.test.android.ui.tsm.feature.FeatureActivity;
import com.luffy.test.android.ui.tsm.multiCard.MultiCardActivity;

public enum TSMModel {

    TSM_FEATURE("TSM功能", FeatureActivity.class),
    TSM_MULTI_CARD("TMS双标卡", MultiCardActivity.class);

    public String name;
    public Class mClass;

    TSMModel(String name, Class mClass) {
        this.name = name;
        this.mClass = mClass;
    }
}
