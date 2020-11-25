package com.luffy.test.android.ui.owner.thread.asyncTask;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

import com.luffy.test.android.utils.DownloadPictureUtils;

/**
 * Created by lvlufei on 2020-08-14
 *
 * @name 下载图片异步任务
 */
public class LoadImageAsyncTask extends AsyncTask<String, Integer, Bitmap> {

    private ImageView imageView;

    public void display(final ImageView imageView, final String url) {
        this.imageView = imageView;
        execute(url);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /**
     * 后台执行任务
     */
    @Override
    protected Bitmap doInBackground(String... params) {
        return DownloadPictureUtils.getInstance().download(params);
    }

    /**
     * 更新UI
     */
    @Override
    protected void onPostExecute(Bitmap result) {
        super.onPostExecute(result);
        imageView.setImageBitmap(result);
    }

    /**
     * 进度更新
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

}
