package com.luffy.test.android.ui.owner.thread;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.luffy.test.tbaselayerlib.base.BaseApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lvlufei on 2020-11-25
 *
 * @name 本地缓存
 */
public class LocalCacheUtils {

    private String LOCAL_CACHE_PATH;

    public LocalCacheUtils() {
        LOCAL_CACHE_PATH = FileStorageUtils.getInstance().getExternalCachePath(BaseApplication.getInstance()) + File.separator + "image_cache";
    }

    //写本地缓存
    public void setLocalCache(String url, Bitmap bitmap) {
        FileOutputStream fos = null;
        try {
            // 创建文件目录
            File dir = new File(LOCAL_CACHE_PATH);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            // 创建文件
            File imageFile = new File(dir, MD5Utils.getInstance().md5(url) + ".png");
            if (!imageFile.exists()) {
                imageFile.createNewFile();
            }
            // 写文件
            fos = new FileOutputStream(imageFile);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.flush();
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //读本地缓存
    public Bitmap getLocalCache(String url) {
        FileInputStream fileInputStream = null;
        try {
            File cacheFile = new File(LOCAL_CACHE_PATH, MD5Utils.getInstance().md5(url) + ".png");
            if (cacheFile.exists()) {
                fileInputStream = new FileInputStream(cacheFile);
                Bitmap bitmap = BitmapFactory.decodeStream(fileInputStream);
                return bitmap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

