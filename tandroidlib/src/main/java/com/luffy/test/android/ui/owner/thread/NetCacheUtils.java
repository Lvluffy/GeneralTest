package com.luffy.test.android.ui.owner.thread;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.luffy.test.android.utils.DownloadPictureUtils;

/**
 * Created by lvlufei on 2020-11-25
 *
 * @name 网络缓存
 */
public class NetCacheUtils {

    private LocalCacheUtils mLocalCacheUtil;
    private MemoryCacheUtils mMemoryCacheUtil;

    public NetCacheUtils(LocalCacheUtils localCacheUtil, MemoryCacheUtils memoryCacheUtil) {
        this.mLocalCacheUtil = localCacheUtil;
        this.mMemoryCacheUtil = memoryCacheUtil;
    }

    // 从网络加载图片
    public void getBitmapFromNet(ImageView imageView, String url) {
        new BitmapTask().execute(imageView, url);
    }

    class BitmapTask extends AsyncTask<Object, Integer, Bitmap> {

        private ImageView imageView;
        private String url;

        /**
         * 1.预加载 ，运行在主线程
         */
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /**
         * 2.正在加载(核心方法)，运行在子线程
         */
        @Override
        protected Bitmap doInBackground(Object... params) {
            imageView = (ImageView) params[0];
            url = (String) params[1];
            imageView.setTag(url);
            return DownloadPictureUtils.getInstance().download(url);
        }

        /**
         * 3.进度更新（如果下载文件），运行在主线程
         */
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        /**
         * 4.加载结束，运行在主线程
         */
        @Override
        protected void onPostExecute(Bitmap result) {
            // 由于listview的重用机制导致imageview对象可能被多个item共用,
            // 从而可能将错误的图片设置给了imageView对象
            // 所以需要在此处校验, 判断是否是正确的图片
            if (result == null) {
                return;
            }
            String url = (String) imageView.getTag();
            if (url != null && url.equals(this.url)) {
                // 从网络加载图片
                imageView.setImageBitmap(result);
                // 写本地缓存
                mLocalCacheUtil.setLocalCache(url, result);
                //写内存缓存
                mMemoryCacheUtil.setMemoryCache(url, result);
            }
        }
    }
}
