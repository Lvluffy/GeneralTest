package com.luffy.test.android.ui.owner.rxjava;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseActivity;
import com.luffy.test.android.base.BaseResponse;
import com.luffy.test.android.base.ErrorCode;

import java.util.concurrent.Callable;

import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name rxjava
 */
public class RxJavaActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.btn_invoke)
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_invoke) {
            doRxJava();
        }
    }

    private void doRxJava() {
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
