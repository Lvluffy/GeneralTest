package com.luffy.test.android.ui.ipc.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-10-23
 *
 * @name 跨进程通讯-Activity
 */
public class IPCActivityFragment extends BaseFragment {

    private static final String ACTION_GENERAL_NETWORK = "com.luffy.generalnetwork.ui.LoginActivity";
    private static final String ACTION_AOJI_LIUXUE = "com.aoji.liuxue.MainActivity";

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ipcactivity, container, false);
    }

    @OnClick(R2.id.btn_invoke)
    public void onViewClicked() {
        Intent intent = new Intent();
        intent.setAction(ACTION_AOJI_LIUXUE);
        startActivity(intent);
    }
}
