package com.luffy.generaltest;

import android.content.Intent;
import android.os.Bundle;

import com.luffy.test.android.ui.bankCard.BankCardDetailActivity;
import com.luffy.test.android.ui.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        Intent intent = new Intent(this, BankCardDetailActivity.class);
        startActivity(intent);
    }
}
