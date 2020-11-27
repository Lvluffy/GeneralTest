package com.luffy.test.android.ui.owner.thread.handler;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.ui.owner.thread.BitmapDisplayFactory;
import com.luffy.test.android.ui.owner.thread.BitmapDisplayMode;
import com.luffy.test.android.ui.owner.thread.IBitmapDisplayMode;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tbaselayerlib.base.UrlConstantManager;
import com.luffy.utils.generallib.ThreadUtils;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-17
 *
 * @name
 */
public class HandlerFragment extends BaseFragment {

    private static final int CHILD_THREAD = 6;

    @BindView(R2.id.txt_content)
    TextView txtContent;
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

    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == CHILD_THREAD) {
                txtContent.setText((String) msg.obj);
            }
        }

    };

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_handler, container, false);
    }

    @OnClick({R2.id.btn_main, R2.id.btn_child, R2.id.btn_open})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_main) {
            txtContent.setText(getContent());
        } else if (id == R.id.btn_child) {
            new Thread("child") {
                @Override
                public void run() {
                    Message msg = new Message();
                    msg.what = CHILD_THREAD;
                    msg.obj = getContent();
                    handler.sendMessage(msg);
                }
            }.start();
        } else if (id == R.id.btn_open) {
            IBitmapDisplayMode iBitmapDisplayMode = BitmapDisplayFactory.makeBitmapDisplayMode(BitmapDisplayMode.HANDLER);
            iBitmapDisplayMode.display(image1, UrlConstantManager.getInstance().getUrlList().get(11));
            iBitmapDisplayMode.display(image2, UrlConstantManager.getInstance().getUrlList().get(12));
            iBitmapDisplayMode.display(image3, UrlConstantManager.getInstance().getUrlList().get(13));
            iBitmapDisplayMode.display(image4, UrlConstantManager.getInstance().getUrlList().get(14));
            iBitmapDisplayMode.display(image5, UrlConstantManager.getInstance().getUrlList().get(15));
        }
    }

    private String getContent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("是否为主线程：").append(ThreadUtils.isMainThread()).append("\n");
        stringBuilder.append("当前线程名称：").append(ThreadUtils.getCurrentThreadName());
        return stringBuilder.toString();
    }
}


