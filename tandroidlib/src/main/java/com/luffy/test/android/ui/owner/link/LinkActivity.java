package com.luffy.test.android.ui.owner.link;

import android.os.Bundle;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-07-29
 *
 * @name AppLink
 */
public class LinkActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new LinkFragment());
    }
}
