package com.luffy.test.android.ui.module.receiver.staticRegister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-10-23
 *
 * @name 静态注册广播接收者
 */
public class ReceiverStaticRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentUtils.getInstance().replaceFragment(this, new ReceiverStaticRegisterFragment());
    }
}
