package com.luffy.test.android.ui.owner.thread.handler;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

import com.luffy.test.android.utils.DownloadPictureUtils;

public class LoadImageHandler {

    Bitmap bitmap;

    private LoadImageHandler() {

    }

    public static LoadImageHandler getInstance() {
        return LoadImageHandlerHolder.instance;
    }

    private static class LoadImageHandlerHolder {
        private static final LoadImageHandler instance = new LoadImageHandler();
    }

    @SuppressLint("HandlerLeak")
    public void DownLoadImage(final Handler handler, final int what, final String urlStr) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bitmap = DownloadPictureUtils.getInstance().download(urlStr);
                    Message msg = new Message();
                    msg.what = what;
                    msg.obj = bitmap;
                    handler.sendMessage(msg);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}