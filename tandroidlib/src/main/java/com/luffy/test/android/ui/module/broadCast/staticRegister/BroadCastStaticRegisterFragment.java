package com.luffy.test.android.ui.module.broadCast.staticRegister;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.receiver.TestStaticReceiver;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.AppUtils;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-10-23
 *
 * @name 静态注册广播接收者
 */
public class BroadCastStaticRegisterFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_receiver_static_register, container, false);
    }

    @OnClick({R2.id.btn_explicit_send, R2.id.btn_implicit_send})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_explicit_send) {
            //显式
            Intent intent = new Intent(mContext, TestStaticReceiver.class);
            intent.putExtra("data", "我是数据:显式-静态注册广播接收者");
            mContext.sendBroadcast(intent);
        } else if (id == R.id.btn_implicit_send) {
            //隐式：【注意】Andorid8.0以后，静态注册广播，隐式方式发送需要设置包名，否则无法收到。
            Intent intent = new Intent();
            intent.setAction(TestStaticReceiver.ACTION);
            intent.setPackage(AppUtils.getInstance().getAppPackName(mContext));
            intent.putExtra("data", "我是数据：隐式-静态注册广播接收者");
            mContext.sendBroadcast(intent);
        }
    }
}
