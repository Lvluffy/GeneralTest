package com.luffy.test.android.ui.module.broadCast.dynamicRegister;


import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.receiver.TestDynamicReceiver;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-10-23
 *
 * @name 动态注册广播接收者
 */
public class BroadCastDynamicRegisterFragment extends BaseFragment {

    TestDynamicReceiver testDynamicReceiver = new TestDynamicReceiver();

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_receiver_dynamic_register, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        mContext.registerReceiver(testDynamicReceiver, new IntentFilter(TestDynamicReceiver.ACTION));
    }

    @Override
    public void onDestroy() {
        mContext.unregisterReceiver(testDynamicReceiver);
        super.onDestroy();
    }

    @OnClick(R2.id.btn_send_broadcast)
    public void onViewClicked() {
        Intent intent = new Intent();
        intent.setAction(TestDynamicReceiver.ACTION);
        intent.putExtra("data", "我是数据：动态注册广播接收者");
        mContext.sendBroadcast(intent);
    }

}
