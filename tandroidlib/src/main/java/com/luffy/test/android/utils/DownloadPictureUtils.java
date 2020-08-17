package com.luffy.test.android.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lvlufei on 2020-08-17
 *
 * @name 下载图片-辅助工具
 */
public class DownloadPictureUtils {
    private DownloadPictureUtils() {
    }

    public static DownloadPictureUtils getInstance() {
        return DownloadPictureUtilsHolder.instance;
    }

    private static class DownloadPictureUtilsHolder {
        private static final DownloadPictureUtils instance = new DownloadPictureUtils();
    }

    /**
     * 下载
     *
     * @param parameter
     * @return
     */
    public Bitmap download(String... parameter) {
        Bitmap bitmap = null;
        InputStream inputStream = null;
        try {
            URL url = new URL(parameter[0]);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            inputStream = connection.getInputStream();
            bitmap = BitmapFactory.decodeStream(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return bitmap;
    }
}
