package com.luffy.test.android.ui.owner.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.ui.owner.thread.handler.HandlerActivity;
import com.luffy.test.android.utils.NotificationUtils;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-13
 *
 * @name 通知
 */
public class NotificationFragment extends BaseFragment {

    private static final String CHANNEL_ID = "test";
    private static final String CHANNEL_NAME = "测试";

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NotificationUtils.getInstance().cancelNotification(mContext, 1);
        NotificationUtils.getInstance().cancelNotification(mContext, 2);
        NotificationUtils.getInstance().cancelNotification(mContext, 3);
        NotificationUtils.getInstance().cancelNotification(mContext, 4);
    }

    @OnClick({R2.id.btn_send_default_notification,
            R2.id.btn_send_custom_notification,
            R2.id.btn_send_large_view_notification,
            R2.id.btn_send_large_img_notification})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_send_default_notification) {
            defaultNotify();
        } else if (id == R.id.btn_send_custom_notification) {
            customNotify();
        } else if (id == R.id.btn_send_large_view_notification) {
            largeViewNotify();
        } else if (id == R.id.btn_send_large_img_notification) {
            largeImgNotify();
        }
    }


    /**
     * 默认通知
     */
    public void defaultNotify() {
        PendingIntent pendingIntent = PendingIntent.getActivity(mContext, 0, new Intent(mContext, HandlerActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
        Notification notification = NotificationUtils.getInstance().createBuilder(mContext, CHANNEL_ID)
                .setSmallIcon(R.drawable.icon_car)
                .setWhen(System.currentTimeMillis())
                .setContentTitle("标题")
                .setContentText("内容")
                .setContentIntent(pendingIntent)
                .build();
        NotificationUtils.getInstance().notifyNotification(mContext, CHANNEL_ID, CHANNEL_NAME, notification, 1);
    }

    /**
     * 自定义通知
     */
    public void customNotify() {
        PendingIntent pendingIntent = PendingIntent.getActivity(mContext, 0, new Intent(mContext, HandlerActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
        RemoteViews contentView = new RemoteViews(mContext.getPackageName(), R.layout.layout_notify_custom);
        contentView.setTextViewText(R.id.notify_title, "标题");
        contentView.setTextViewText(R.id.notify_content, "内容");
        contentView.setImageViewResource(R.id.notify_icon, R.drawable.icon_car);
        Notification notification = NotificationUtils.getInstance().createBuilder(mContext, CHANNEL_ID)
                .setSmallIcon(R.drawable.icon_car)
                .setWhen(System.currentTimeMillis())
                .setContent(contentView)
                .setContentIntent(pendingIntent)
                .build();
        NotificationUtils.getInstance().notifyNotification(mContext, CHANNEL_ID, CHANNEL_NAME, notification, 2);
    }

    /**
     * 大视图通知
     */
    public void largeViewNotify() {
        PendingIntent pendingIntent = PendingIntent.getActivity(mContext, 0, new Intent(mContext, HandlerActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.BigPictureStyle bigStyle = new NotificationCompat.BigPictureStyle();
        bigStyle.bigPicture(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.icon_car));
        bigStyle.setSummaryText("你好啊");
        Notification notification = NotificationUtils.getInstance().createBuilder(mContext, CHANNEL_ID)
                .setSmallIcon(R.drawable.icon_car)
                .setWhen(System.currentTimeMillis())
                .setContentTitle("标题")
                .setContentText("内容")
                .setStyle(bigStyle)
                .setContentIntent(pendingIntent)
                .build();
        NotificationUtils.getInstance().notifyNotification(mContext, CHANNEL_ID, CHANNEL_NAME, notification, 3);
    }

    /**
     * 大图片通知
     */
    public void largeImgNotify() {
        PendingIntent pendingIntent = PendingIntent.getActivity(mContext, 0, new Intent(mContext, HandlerActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
        RemoteViews contentView = new RemoteViews(mContext.getPackageName(), R.layout.layout_notify_large_photo);
        contentView.setImageViewBitmap(R.id.notify_icon, BitmapFactory.decodeResource(getResources(), R.drawable.icon_car));
        Notification notification = NotificationUtils.getInstance().createBuilder(mContext, CHANNEL_ID)
                .setSmallIcon(R.drawable.icon_car)
                .setWhen(System.currentTimeMillis())
                .setContent(contentView)
                .setContentIntent(pendingIntent)
                .build();
        NotificationUtils.getInstance().notifyNotification(mContext, CHANNEL_ID, CHANNEL_NAME, notification, 4);
    }
}
