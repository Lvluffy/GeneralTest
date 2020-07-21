package com.luffy.generaltest;

import android.os.Bundle;
import android.view.View;

import com.luffy.test.android.base.BaseActivity;
import com.luffy.test.android.ui.owner.activityForResult.BankCardDetailActivity;
import com.luffy.test.android.ui.owner.handler.HandlerActivity;
import com.luffy.test.android.ui.owner.provider.ProviderActivity;
import com.luffy.test.android.ui.owner.rxjava.RxJavaActivity;
import com.luffy.test.android.ui.owner.settings.SettingsActivity;
import com.luffy.test.android.ui.tsm.feature.FeatureActivity;
import com.luffy.test.android.ui.tsm.multiCard.MultiCardActivity;
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

    @OnClick({R.id.owner_activity_for_result,
            R.id.owner_test_provider,
            R.id.owner_handler,
            R.id.owner_rxjava,
            R.id.owner_settings,
            R.id.tsm_feature,
            R.id.tsm_multi_card
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.owner_activity_for_result:
                IntentUtils.getInstance().startActivity(this, BankCardDetailActivity.class);
                break;
            case R.id.owner_test_provider:
                IntentUtils.getInstance().startActivity(this, ProviderActivity.class);
                break;
            case R.id.owner_handler:
                IntentUtils.getInstance().startActivity(this, HandlerActivity.class);
                break;
            case R.id.owner_rxjava:
                IntentUtils.getInstance().startActivity(this, RxJavaActivity.class);
                break;
            case R.id.owner_settings:
                IntentUtils.getInstance().startActivity(this, SettingsActivity.class);
                break;
            case R.id.tsm_feature:
                IntentUtils.getInstance().startActivity(this, FeatureActivity.class);
                break;
            case R.id.tsm_multi_card:
                IntentUtils.getInstance().startActivity(this, MultiCardActivity.class);
                break;
        }
    }

}
