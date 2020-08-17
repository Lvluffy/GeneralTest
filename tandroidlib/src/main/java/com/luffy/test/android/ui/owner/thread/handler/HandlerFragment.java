package com.luffy.test.android.ui.owner.thread.handler;


import android.graphics.Bitmap;
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
import com.luffy.test.android.utils.ThreadUtils;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tbaselayerlib.base.UrlConstantManager;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-17
 *
 * @name
 */
public class HandlerFragment extends BaseFragment {

    private static final int IMAGE1 = 1;
    private static final int IMAGE2 = 2;
    private static final int IMAGE3 = 3;
    private static final int IMAGE4 = 4;
    private static final int IMAGE5 = 5;
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
            if (msg.what == IMAGE1) {
                image1.setImageBitmap((Bitmap) msg.obj);
            } else if (msg.what == IMAGE2) {
                image2.setImageBitmap((Bitmap) msg.obj);
            } else if (msg.what == IMAGE3) {
                image3.setImageBitmap((Bitmap) msg.obj);
            } else if (msg.what == IMAGE4) {
                image4.setImageBitmap((Bitmap) msg.obj);
            } else if (msg.what == IMAGE5) {
                image5.setImageBitmap((Bitmap) msg.obj);
            } else if (msg.what == CHILD_THREAD) {
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
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("是否为出线程：").append(ThreadUtils.getInstance().isMainThread()).append("\n");
            stringBuilder.append("当前线程名称：").append(ThreadUtils.getInstance().getCurrentThreadName());
            txtContent.setText(stringBuilder.toString());
        } else if (id == R.id.btn_child) {
            new Thread("child") {
                @Override
                public void run() {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("是否为出线程：").append(ThreadUtils.getInstance().isMainThread()).append("\n");
                    stringBuilder.append("当前线程名称：").append(ThreadUtils.getInstance().getCurrentThreadName());
                    Message msg = new Message();
                    msg.what = CHILD_THREAD;
                    msg.obj = stringBuilder.toString();
                    handler.sendMessage(msg);
                }
            }.start();
        } else if (id == R.id.btn_open) {
            LoadImageHandler.getInstance().DownLoadImage(handler, IMAGE1, UrlConstantManager.getInstance().getUrlList().get(11));
            LoadImageHandler.getInstance().DownLoadImage(handler, IMAGE2, UrlConstantManager.getInstance().getUrlList().get(12));
            LoadImageHandler.getInstance().DownLoadImage(handler, IMAGE3, UrlConstantManager.getInstance().getUrlList().get(13));
            LoadImageHandler.getInstance().DownLoadImage(handler, IMAGE4, UrlConstantManager.getInstance().getUrlList().get(14));
            LoadImageHandler.getInstance().DownLoadImage(handler, IMAGE5, UrlConstantManager.getInstance().getUrlList().get(15));
        }
    }
}
