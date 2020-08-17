package com.luffy.test.android.ui.owner.thread.asyncTask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tbaselayerlib.base.UrlConstantManager;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-14
 *
 * @name 异步任务
 */
public class AsyncTaskFragment extends BaseFragment {

    @BindView(R2.id.image1)
    ImageView image1;
    @BindView(R2.id.image2)
    ImageView image2;
    @BindView(R2.id.image3)
    ImageView image3;
    @BindView(R2.id.image4)
    ImageView image4;
    @BindView(R2.id.image5)
    ImageView image5;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_async_task, container, false);
    }

    @OnClick(R2.id.btn_open)
    public void onViewClicked() {
        new LoadImageAsyncTask(image1).execute(UrlConstantManager.getInstance().getUrlList().get(1));
        new LoadImageAsyncTask(image2).execute(UrlConstantManager.getInstance().getUrlList().get(2));
        new LoadImageAsyncTask(image3).execute(UrlConstantManager.getInstance().getUrlList().get(3));
        new LoadImageAsyncTask(image4).execute(UrlConstantManager.getInstance().getUrlList().get(4));
        new LoadImageAsyncTask(image5).execute(UrlConstantManager.getInstance().getUrlList().get(5));
    }
}
