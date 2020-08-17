package com.luffy.test.android.ui.owner.thread.executorService;

import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.ImageView;

import com.luffy.test.android.utils.DownloadPictureUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lvlufei on 2020-08-17
 *
 * @name 下载图片线程池
 */
public class LoadImageExecutorService {

    private ExecutorService executorService = Executors.newFixedThreadPool(1);// 同时最多启动1个线程
    private Bitmap bitmap;

    public static LoadImageExecutorService getInstance() {
        return new LoadImageExecutorService();
    }

    public void DownLoadImage(final ImageView imageView, final String url) {
        final Handler handler = new Handler();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                bitmap = DownloadPictureUtils.getInstance().download(url);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                        bitmap = null;
                    }
                });
            }
        });
    }
}
