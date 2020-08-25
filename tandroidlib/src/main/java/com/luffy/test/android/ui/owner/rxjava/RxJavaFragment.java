package com.luffy.test.android.ui.owner.rxjava;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.service.TestService;
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
                        onStartService();
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(2000);
                                    onBindService();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                    }
                });
    }

    private void onStartService() {
        final Intent intent = new Intent(mContext, TestService.class);
        mActivity.startService(intent);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    mActivity.stopService(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void onBindService() {
        final Intent intent = new Intent(mContext, TestService.class);
        final ServiceConnection serviceConnection = new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {

            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };
        mActivity.bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    mActivity.unbindService(serviceConnection);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
