package com.luffy.test.android.ui.owner.thread.executorService;


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
 * Created by lvlufei on 2020-08-17
 *
 * @name 线程池
 */
public class ExecutorServiceFragment extends BaseFragment {

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
        return inflater.inflate(R.layout.fragment_executor, container, false);
    }

    @OnClick(R2.id.btn_open)
    public void onViewClicked() {
        LoadImageExecutorService.getInstance().display(image1, UrlConstantManager.getInstance().getUrlList().get(6));
        LoadImageExecutorService.getInstance().display(image2, UrlConstantManager.getInstance().getUrlList().get(7));
        LoadImageExecutorService.getInstance().display(image3, UrlConstantManager.getInstance().getUrlList().get(8));
        LoadImageExecutorService.getInstance().display(image4, UrlConstantManager.getInstance().getUrlList().get(9));
        LoadImageExecutorService.getInstance().display(image5, UrlConstantManager.getInstance().getUrlList().get(10));
    }
}
