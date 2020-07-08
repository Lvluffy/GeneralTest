package com.luffy.generaltest;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.luffy.generaltest.bean.BaseResponse;
import com.luffy.generaltest.bean.ErrorCode;
import com.luffy.test.android.base.BaseActivity;
import com.luffy.test.android.ui.bankCard.BankCardDetailActivity;
import com.luffy.test.android.ui.provider.ContentProviderActivity;
import com.luffy.test.android.ui.provider.TestProviderActivity;
import com.luffy.test.android.ui.settings.SettingsActivity;
import com.luffy.test.android.ui.swipingCard.SwipingCardActivity;
import com.luffy.utils.generallib.IntentUtils;

import java.util.concurrent.Callable;

import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

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

    @OnClick({R.id.btn,
            R.id.btn_content_provider,
            R.id.btn_content_provider_test,
            R.id.btn_swiping_card,
            R.id.btn_settings
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn:
                IntentUtils.getInstance().startActivity(this, BankCardDetailActivity.class);
                Log.v(TAG, "versionCode = " + getVersionCode(this, "com.luffy.generalhybrid"));
                testRxJava();
                break;
            case R.id.btn_content_provider:
                IntentUtils.getInstance().startActivity(this, ContentProviderActivity.class);
                break;
            case R.id.btn_content_provider_test:
                IntentUtils.getInstance().startActivity(this, TestProviderActivity.class);
                break;
            case R.id.btn_swiping_card:
                IntentUtils.getInstance().startActivity(this, SwipingCardActivity.class);
                break;
            case R.id.btn_settings:
                IntentUtils.getInstance().startActivity(this, SettingsActivity.class);
                break;
        }
    }

    /**
     * 获取应用程序-版本号-通过包名
     *
     * @param context     上下文
     * @param packageName 应用包名
     * @return 应用版本
     */
    private int getVersionCode(Context context, String packageName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private void testRxJava() {
        Observable.fromCallable(new Callable<BaseResponse>() {
            @Override
            public BaseResponse call() throws Exception {
                Log.v(TAG, "call");
                return new BaseResponse(ErrorCode.SUCCESS);
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<BaseResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.v(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.v(TAG, "onError");
                    }

                    @Override
                    public void onNext(BaseResponse baseResponse) {
                        Log.v(TAG, "onNext");
                        if (baseResponse.isSuccess()) {
                            Log.v(TAG, "buildCache onLoadSuccess");
                        } else {
                            Log.v(TAG, "buildCache onLoadFailed: code = " + baseResponse.mResultCode + ";msg = " + baseResponse.mMsg);
                        }
                    }
                });
    }

}
