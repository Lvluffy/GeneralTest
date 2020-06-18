package com.luffy.generaltest;

import android.os.Bundle;

import com.luffy.test.android.ui.bankCard.BankCardDetailActivity;
import com.luffy.test.android.ui.base.BaseActivity;
import com.luffy.utils.generallib.IntentUtils;

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
        IntentUtils.getInstance().startActivity(this, BankCardDetailActivity.class);
    }
}
