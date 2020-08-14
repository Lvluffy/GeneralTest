package com.luffy.test.android.ui.owner.thread.asyncTask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lvlufei on 2020-08-14
 *
 * @name 异步下载图片任务
 */
public class AsyncLoadImageTask extends AsyncTask<String, Integer, Bitmap> {

    private ImageView imageView;

    public AsyncLoadImageTask(ImageView imageView) {
        this.imageView = imageView;
    }

    /**
     * 后台执行任务
     */
    @Override
    protected Bitmap doInBackground(String... params) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(params[0]);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoInput(true);// 以后就可以使用conn.getInputStream().read();
            InputStream inputStream = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
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
