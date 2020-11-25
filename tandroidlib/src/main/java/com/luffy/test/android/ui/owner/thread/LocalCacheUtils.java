package com.luffy.test.android.ui.owner.thread;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by lvlufei on 2020-11-25
 *
 * @name 本地缓存
 */
public class LocalCacheUtils {

    private static final String LOCAL_CACHE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/image_cache";

    //写本地缓存
    public void setLocalCache(String url, Bitmap bitmap) {
        Log.d("LocalCacheUtils", LOCAL_CACHE_PATH);
        File dir = new File(LOCAL_CACHE_PATH);
        if (!dir.exists() || !dir.isDirectory()) {
            dir.mkdirs();//创建文件夹
        }

        try {
            File cacheFile = new File(dir, url);
            // 参1:图片格式;参2:压缩比例0-100; 参3:输出流
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(cacheFile));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //读本地缓存
    public Bitmap getLocalCache(String url) {
        try {
            Log.d("LocalCacheUtils", LOCAL_CACHE_PATH);
            File cacheFile = new File(LOCAL_CACHE_PATH, url);
            if (cacheFile.exists()) {
                Bitmap bitmap = BitmapFactory.decodeStream(new FileInputStream(cacheFile));
                return bitmap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
