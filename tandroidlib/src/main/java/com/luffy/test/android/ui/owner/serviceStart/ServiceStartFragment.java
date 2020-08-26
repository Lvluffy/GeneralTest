package com.luffy.test.android.ui.owner.serviceStart;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.AppUtils;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-26
 *
 * @name 服务启动
 */
public class ServiceStartFragment extends BaseFragment {

    public static final String TEST_INTENT_SERVICE_ACTION = "com.luffy.generaltest.action.TEST_INTENT_SERVICE";
    public static final String TEST_SERVICE_ACTION = "com.luffy.generaltest.action.TEST_SERVICE";

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_service_start, container, false);
    }

    @OnClick({R2.id.btn_start_service,
            R2.id.btn_bind_service,
            R2.id.btn_start_intent_service,
            R2.id.btn_bind_intent_service})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_start_service) {
            onStartService();
        } else if (id == R.id.btn_bind_service) {
            onBindService();
        } else if (id == R.id.btn_start_intent_service) {
            onStartIntentService();
        } else if (id == R.id.btn_bind_intent_service) {
            onBindIntentService();
        }
    }

    private void onStartService() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent intent = new Intent(TEST_SERVICE_ACTION);
                    intent.setPackage(AppUtils.getInstance().getAppPackName(mContext));
                    mActivity.startService(intent);
                    Thread.sleep(2000);
                    mActivity.stopService(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void onBindService() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent intent = new Intent(TEST_SERVICE_ACTION);
                    intent.setPackage(AppUtils.getInstance().getAppPackName(mContext));
                    ServiceConnection serviceConnection = new ServiceConnection() {
                        @Override
                        public void onServiceConnected(ComponentName name, IBinder service) {

                        }

                        @Override
                        public void onServiceDisconnected(ComponentName name) {

                        }
                    };
                    mActivity.bindService(intent, serviceConnection, Context.BIND_AUTO_CREATE);
                    Thread.sleep(2000);
                    mActivity.unbindService(serviceConnection);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void onStartIntentService() {
        Intent intent = new Intent(TEST_INTENT_SERVICE_ACTION);
        intent.setPackage(AppUtils.getInstance().getAppPackName(mContext));
        mActivity.startService(intent);
    }

    private void onBindIntentService() {
        Intent intent = new Intent(TEST_INTENT_SERVICE_ACTION);
        intent.setPackage(AppUtils.getInstance().getAppPackName(mContext));
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
