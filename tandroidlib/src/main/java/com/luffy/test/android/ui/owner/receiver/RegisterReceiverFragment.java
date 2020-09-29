package com.luffy.test.android.ui.owner.receiver;


import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.receiver.TestReceiver;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-09-29
 *
 * @name 注册广播
 */
public class RegisterReceiverFragment extends BaseFragment {

    TestReceiver testReceiver = new TestReceiver();

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register_receiver, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext.registerReceiver(testReceiver, new IntentFilter(TestReceiver.ACTION));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mContext.unregisterReceiver(testReceiver);
    }

    @OnClick(R2.id.btn_send_broadcast)
    public void onViewClicked() {
        Intent intent = new Intent();
        intent.setAction(TestReceiver.ACTION);
        intent.putExtra("data", "我是数据");
        mContext.sendBroadcast(intent);
    }
}
