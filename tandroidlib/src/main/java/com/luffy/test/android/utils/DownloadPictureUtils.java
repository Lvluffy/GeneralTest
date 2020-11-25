package com.luffy.test.android.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.luffy.utils.generallib.ExceptionCloseUtils;

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
     * @param path
     * @return
     */
    public Bitmap download(String path) {
        Bitmap bitmap = null;
        InputStream inputStream = null;
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                inputStream = connection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ExceptionCloseUtils.getInstance().close(inputStream);
        }
        return bitmap;
    }
}
