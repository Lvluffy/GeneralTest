package com.luffy.test.android.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.luffy.test.android.R;

import java.lang.ref.WeakReference;


/**
 * Created by lvlufei on 2020-08-13
 *
 * @name 通知-辅助工具
 */
public class NotifyUtils {

    private NotificationManager notificationManager;
    private NotificationChannel notificationChannel;
    private PendingIntent pendingIntent;
    private NotificationCompat.Builder builder;
    private Notification notification;
    private WeakReference<Context> rfContext;

    private NotifyUtils(Context context) {
        rfContext = new WeakReference<>(context);
        notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
    }

    public static NotifyUtils getInstance(Context context) {
        return new NotifyUtilsHolder(context).instance;
    }

    private static class NotifyUtilsHolder {
        private NotifyUtils instance;

        public NotifyUtilsHolder(Context context) {
            instance = new NotifyUtils(context);
        }
    }

    /**
     * 发送通知
     *
     * @param notificationFlow
     */
    public void sendNotification(NotificationFlow notificationFlow) {
        if (notificationFlow != null) {
            notificationChannel = notificationFlow.onNotificationChannel();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                if (notificationChannel != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            pendingIntent = notificationFlow.onPendingIntent();
            builder = notificationFlow.onBuilder();
            notification = notificationFlow.onNotification();
            notificationFlow.onNotify();
        }
    }

    /**
     * 创建通知渠道
     *
     * @param channelId
     * @param channelName
     * @param importance
     * @return
     */
    public NotificationChannel createNotificationChannel(String channelId, CharSequence channelName, int importance) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return new NotificationChannel(channelId, channelName, importance);
        }
        return null;
    }

    public NotificationChannel createNotificationChannel(String channelId, CharSequence channelName) {
        return createNotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT);
    }

    /**
     * 系统默认的通知
     *
     * @param title
     * @param content
     */
    public void defaultNotify(final String title, final String content, final Intent intent) {
        sendNotification(new NotificationFlow() {
            @Override
            public NotificationChannel onNotificationChannel() {
                return createNotificationChannel("test", "testName");
            }

            @Override
            public PendingIntent onPendingIntent() {
                return PendingIntent.getActivity(rfContext.get(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            }

            @Override
            public NotificationCompat.Builder onBuilder() {
                return createBuilder()
                        .setContentTitle(title)
                        .setContentText(content)
                        .setContentIntent(pendingIntent);
            }

            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public Notification onNotification() {
                return builder.build();
            }

            @Override
            public void onNotify() {
                notificationManager.notify(1, notification);
            }
        });
    }

    /**
     * 自定义通知
     *
     * @param title
     * @param content
     * @param photoID
     * @param intent
     */
    public void customNotify(final String title, final String content, final int photoID, final Intent intent) {
        sendNotification(new NotificationFlow() {
            @Override
            public NotificationChannel onNotificationChannel() {
                return createNotificationChannel("test", "testName");
            }

            @Override
            public PendingIntent onPendingIntent() {
                return PendingIntent.getActivity(rfContext.get(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            }

            @Override
            public NotificationCompat.Builder onBuilder() {
                // 自定义通知栏布局
                RemoteViews contentView = new RemoteViews(rfContext.get().getPackageName(), R.layout.layout_notify_custom);
                contentView.setTextViewText(R.id.notify_title, title);
                contentView.setTextViewText(R.id.notify_content, content);
                contentView.setImageViewResource(R.id.notify_icon, photoID);
                return createBuilder()
                        .setContent(contentView)
                        .setContentIntent(pendingIntent);
            }

            @Override
            public Notification onNotification() {
                return builder.build();
            }

            @Override
            public void onNotify() {
                notificationManager.notify(2, notification);
            }
        });
    }

    /**
     * 大视图通知
     *
     * @param title
     * @param content
     * @param intent
     */
    public void largeViewNotify(final String title, final String content, final Intent intent) {
        sendNotification(new NotificationFlow() {
            @Override
            public NotificationChannel onNotificationChannel() {
                return createNotificationChannel("test", "testName");
            }

            @Override
            public PendingIntent onPendingIntent() {
                return PendingIntent.getActivity(rfContext.get(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            }

            @Override
            public NotificationCompat.Builder onBuilder() {
                //大型图片样式
                NotificationCompat.BigPictureStyle bigStyle = new NotificationCompat.BigPictureStyle();
                bigStyle.setSummaryText("你好啊");// 设置在细节区域底端添加一行文本
                bigStyle.bigPicture(BitmapFactory.decodeResource(rfContext.get().getResources(), R.drawable.icon_car));
                return createBuilder()
                        .setContentTitle(title)
                        .setContentText(content)
                        .setStyle(bigStyle)
                        .setContentIntent(pendingIntent);
            }

            @Override
            public Notification onNotification() {
                return builder.build();
            }

            @Override
            public void onNotify() {
                notificationManager.notify(3, notification);
            }
        });
    }

    /**
     * 大图片通知
     *
     * @param bitmap
     * @param intent
     */
    public void largeImgNotify(final Bitmap bitmap, final Intent intent) {
        sendNotification(new NotificationFlow() {
            @Override
            public NotificationChannel onNotificationChannel() {
                return createNotificationChannel("test", "testName");
            }

            @Override
            public PendingIntent onPendingIntent() {
                return PendingIntent.getActivity(rfContext.get(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            }

            @Override
            public NotificationCompat.Builder onBuilder() {
                // 指定个性化视图
                RemoteViews contentView = new RemoteViews(rfContext.get().getPackageName(), R.layout.layout_notify_large_photo);
                contentView.setImageViewBitmap(R.id.notify_icon, bitmap);
                return createBuilder()
                        .setContent(contentView)
                        .setContentIntent(pendingIntent);
            }

            @Override
            public Notification onNotification() {
                return builder.build();
            }

            @Override
            public void onNotify() {
                notificationManager.notify(4, notification);
            }
        });
    }

    /**
     * 创建Builder
     *
     * @return
     */
    public NotificationCompat.Builder createBuilder() {
        NotificationCompat.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (notificationChannel != null) {
                builder = new NotificationCompat.Builder(rfContext.get(), notificationChannel.getId());
            } else {
                builder = new NotificationCompat.Builder(rfContext.get());
            }
        } else {
            builder = new NotificationCompat.Builder(rfContext.get());
        }
        //设置通用的属性：自动消失、小图标、时间
        builder.setAutoCancel(true)
                .setSmallIcon(R.drawable.icon_car)
                .setWhen(System.currentTimeMillis());
        return builder;
    }

    /**
     * 取消通知栏弹窗
     *
     * @param id
     */
    public void cancleNotification(int id) {
        notificationManager.cancel(id);
    }

    /**
     * 通知流程
     */
    public interface NotificationFlow {

        /**
         * 创建渠道
         *
         * @return
         */
        NotificationChannel onNotificationChannel();

        /**
         * 创建意图
         *
         * @return
         */
        PendingIntent onPendingIntent();

        /**
         * 创建Builder
         *
         * @return
         */
        NotificationCompat.Builder onBuilder();

        /**
         * 创建通知
         *
         * @return
         */
        Notification onNotification();

        /**
         * 发送通知
         */
        void onNotify();
    }
}
