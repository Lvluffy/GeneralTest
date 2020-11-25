package com.luffy.test.android.ui.owner.thread;

import android.graphics.Bitmap;

import java.lang.ref.SoftReference;
import java.util.HashMap;

/**
 * Created by lvlufei on 2020-11-25
 *
 * @name 内存缓存
 */
public class MemoryCacheUtils {

    private HashMap<String, SoftReference<Bitmap>> hash;

    /**
     * 写内存缓存
     *
     * @param url
     * @param bitmap
     */
    public void setMemoryCache(String url, Bitmap bitmap) {
        if (hash == null) {
            hash = new HashMap<>();
        }
        SoftReference<Bitmap> soft = new SoftReference<>(bitmap);
        hash.put(url, soft);
    }

    /**
     * 读内存缓存
     *
     * @param url
     * @return
     */
    public Bitmap getMemoryCache(String url) {
        if (hash == null) {
            return null;
        }
        Bitmap bitmap = null;
        if (hash.containsKey(url)) {
            SoftReference<Bitmap> soft = hash.get(url);
            bitmap = soft.get();
        }
        return bitmap;
    }
}
