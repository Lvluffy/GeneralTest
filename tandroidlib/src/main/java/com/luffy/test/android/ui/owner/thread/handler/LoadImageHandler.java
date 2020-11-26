package com.luffy.test.android.ui.owner.thread.handler;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;

import com.luffy.utils.bitmaplib.bitmapLoad.DownloadPictureUtils;


public class LoadImageHandler {

    private LoadImageHandler() {

    }

    public static LoadImageHandler getInstance() {
        return LoadImageHandlerHolder.instance;
    }

    private static class LoadImageHandlerHolder {
        private static final LoadImageHandler instance = new LoadImageHandler();
    }

    @SuppressLint("HandlerLeak")
    public void display(final Handler handler, final int what, final String urlStr) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Bitmap bitmap = DownloadPictureUtils.getInstance().download(urlStr);
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
