package com.luffy.generaltest;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.luffy.test.android.base.BaseActivity;
import com.luffy.test.android.ui.ContentProviderActivity;
import com.luffy.test.android.ui.TestProviderActivity;
import com.luffy.test.android.ui.bankCard.BankCardDetailActivity;
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

    }

    /**
     * 获取应用程序-版本号-通过包名
     *
     * @param context     上下文
     * @param packageName 应用包名
     * @return 应用版本
     */
    public int getVersionCode(Context context, String packageName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @OnClick({R.id.btn,
            R.id.btn_content_provider,
            R.id.btn_content_provider_test
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn:
                IntentUtils.getInstance().startActivity(this, BankCardDetailActivity.class);
                Log.v(TAG, "versionCode = " + getVersionCode(this, "com.luffy.generalhybrid"));
                break;
            case R.id.btn_content_provider:
                IntentUtils.getInstance().startActivity(this, ContentProviderActivity.class);
                break;
            case R.id.btn_content_provider_test:
                IntentUtils.getInstance().startActivity(this, TestProviderActivity.class);
                break;
        }
    }
}
