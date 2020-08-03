package com.luffy.test.android.ui.owner.activityForResult;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.luffy.test.android.base.BaseActivity;

public class BankCardResultActivity extends BaseActivity {

    BankCardResultFragment mBankCardResultFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBankCardResultFragment = new BankCardResultFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, mBankCardResultFragment).commitAllowingStateLoss();
    }

    @Override
    public void onBackPressed() {
        if (mBankCardResultFragment != null) mBankCardResultFragment.doFinish();
    }
}
