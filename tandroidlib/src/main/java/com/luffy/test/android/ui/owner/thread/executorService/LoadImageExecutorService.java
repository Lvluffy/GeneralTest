package com.luffy.test.android.ui.owner.thread.executorService;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;

import com.luffy.utils.bitmaplib.bitmapLoad.DownloadPictureUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lvlufei on 2020-08-17
 *
 * @name 下载图片线程池
 */
public class LoadImageExecutorService {

    private ExecutorService executorService = Executors.newFixedThreadPool(1);// 同时最多启动1个线程

    private LoadImageExecutorService() {

    }

    public static LoadImageExecutorService getInstance() {
        return LoadImageExecutorServiceHolder.instance;
    }

    private static class LoadImageExecutorServiceHolder {
        private static final LoadImageExecutorService instance = new LoadImageExecutorService();
    }

    public void display(final ImageView imageView, final String url) {
        final Handler handler = new Handler();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                final Bitmap[] bitmap = {DownloadPictureUtils.getInstance().download(url)};
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageBitmap(bitmap[0]);
                        bitmap[0] = null;
                    }
                });
            }
        });
    }
}
