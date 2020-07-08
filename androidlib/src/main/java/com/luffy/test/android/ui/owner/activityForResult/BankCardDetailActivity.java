package com.luffy.test.android.ui.owner.activityForResult;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

public class BankCardDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BankCardDetailFragment mBankCardDetailFragment = new BankCardDetailFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, mBankCardDetailFragment).commitAllowingStateLoss();
    }
}
