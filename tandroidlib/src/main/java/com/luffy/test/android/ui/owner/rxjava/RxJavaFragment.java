package com.luffy.test.android.ui.owner.rxjava;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import java.util.concurrent.Callable;

import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lvlufei on 2020-07-20
 *
 * @name rxjava
 */
public class RxJavaFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rx_java, container, false);
    }

    @OnClick(R2.id.btn_invoke)
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_invoke) {
            doRxJava();
        }
    }

    private void doRxJava() {
        Observable.fromCallable(new Callable<RxJavaResponse>() {
            @Override
            public RxJavaResponse call() throws Exception {
                Log.v(TAG, "call");
                return new RxJavaResponse(RxJavaResponse.SUCCESS);
            }
        })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Subscriber<RxJavaResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.v(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.v(TAG, "onError");
                    }

                    @Override
                    public void onNext(RxJavaResponse rxJavaResponse) {
                        Log.v(TAG, "onNext");
                        if (rxJavaResponse.isSuccess()) {
                            Log.v(TAG, "buildCache onLoadSuccess");
                        } else {
                            Log.v(TAG, "buildCache onLoadFailed: code = " + rxJavaResponse.mResultCode + ";msg = " + rxJavaResponse.mMsg);
                        }
                    }
                });
    }
}
