package com.luffy.test.android.ui.ipc.service;


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
 * @name 跨进程通讯-服务
 */
public class IPCServiceFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ipc_service, container, false);
    }

    @OnClick(R2.id.btn_invoke)
    public void onViewClicked() {
    }

}
