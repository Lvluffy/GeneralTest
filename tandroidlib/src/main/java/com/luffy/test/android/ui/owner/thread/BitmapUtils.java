package com.luffy.test.android.ui.owner.thread;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by lvlufei on 2020-11-25
 *
 * @name 图片工具
 */
public class BitmapUtils {
    private MemoryCacheUtils mMemoryCacheUtil;//内存缓存工具类
    private LocalCacheUtils mLocalCacheUtil;//本地缓存工具类
    private NetCacheUtils mNetCacheUtil;//网络缓存工具类

    private BitmapUtils() {
        mMemoryCacheUtil = new MemoryCacheUtils();
        mLocalCacheUtil = new LocalCacheUtils();
        mNetCacheUtil = new NetCacheUtils(mLocalCacheUtil, mMemoryCacheUtil);
    }

    public static BitmapUtils getInstance() {
        return BitmapUtilsHolder.instance;
    }

    private static class BitmapUtilsHolder {
        private static final BitmapUtils instance = new BitmapUtils();
    }

    public void display(ImageView imageView, String url) {
        display(imageView, url, 0);
    }

    /**
     * @param imageView 要展示加载图片的ImageView
     * @param url       加载图片的链接
     * @param resId     默认图片的资源id
     */
    public void display(ImageView imageView, String url, int resId) {
        // 设置默认图片
        imageView.setImageResource(resId);

        Bitmap bitmap;
        // 1,从内存加载
        bitmap = mMemoryCacheUtil.getMemoryCache(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }

        // 2,从本地加载
        bitmap = mLocalCacheUtil.getLocalCache(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            //写内存缓存
            mMemoryCacheUtil.setMemoryCache(url, bitmap);
            return;
        }

        // 3,从网络加载
        mNetCacheUtil.getBitmapFromNet(imageView, url);

    }
}
