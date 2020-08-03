package com.luffy.test.android.ui.owner.provider;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 内容提供者
 */
public class ProviderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProviderFragment providerFragment = new ProviderFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, providerFragment).commitAllowingStateLoss();
    }

}
