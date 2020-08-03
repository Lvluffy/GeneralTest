package com.luffy.test.android.ui.owner.handler;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-20
 *
 * @name 处理者
 */
public class HandlerFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_handler, container, false);
    }

    @OnClick({R2.id.btn_main,
            R2.id.btn_child})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_main) {
            doMainThread();

        } else if (id == R.id.btn_child) {
            doChildThread();

        }
    }

    private void doMainThread() {
        Log.v(TAG, "main_thread:Looper.myLooper() == getMainLooper():" + (Looper.myLooper() == Looper.getMainLooper()));
        Log.v(TAG, "thread:" + Thread.currentThread().getName());
    }

    private void doChildThread() {
        new Thread("child") {
            @Override
            public void run() {
                Log.v(TAG, "child_thread: Looper.myLooper() == getMainLooper():" + (Looper.myLooper() == Looper.getMainLooper()));
                Log.v(TAG, "thread:" + Thread.currentThread().getName());
            }
        }.start();
    }
}
