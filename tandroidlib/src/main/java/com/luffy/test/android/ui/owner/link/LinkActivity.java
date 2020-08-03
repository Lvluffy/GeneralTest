package com.luffy.test.android.ui.owner.link;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;
/**
 * Created by lvlufei on 2020-07-29
 *
 * @name AppLink
 */
public class LinkActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinkFragment linkFragment = new LinkFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, linkFragment).commitAllowingStateLoss();
    }
}
