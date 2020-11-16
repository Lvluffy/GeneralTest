package com.luffy.test.android.ui.owner.memory;


import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-11-16
 *
 * @name 内存
 */
public class MemoryFragment extends BaseFragment {

    @BindView(R2.id.content)
    TextView content;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_memory, container, false);
    }

    @OnClick(R2.id.btn)
    public void onViewClicked() {
        getMaxMemoryInfo();
    }

    private void getMaxMemoryInfo() {
        Runtime rt = Runtime.getRuntime();
        long maxMemory = rt.maxMemory();
        ActivityManager activityManager = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MaxMemory:").append(maxMemory / (1024 * 1024)).append("\n");
        stringBuilder.append("MemoryClass:").append(activityManager.getMemoryClass()).append("\n");
        stringBuilder.append("LargeMemoryClass:").append(activityManager.getLargeMemoryClass());
        content.setText(stringBuilder.toString());
    }


}
