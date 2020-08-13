package com.luffy.test.android.ui.owner.notification;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.ui.owner.handler.HandlerActivity;
import com.luffy.test.android.utils.NotifyUtils;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-13
 *
 * @name 通知
 */
public class NotificationFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @OnClick({R2.id.btn_send_default_notification,
            R2.id.btn_send_custom_notification,
            R2.id.btn_send_large_view_notification,
            R2.id.btn_send_large_img_notification})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_send_default_notification) {
            NotifyUtils.getInstance(mContext).defaultNotify("标题", "内容", new Intent(mContext, HandlerActivity.class));
        } else if (id == R.id.btn_send_custom_notification) {
            NotifyUtils.getInstance(mContext).customNotify("标题", "内容", R.drawable.icon_car, new Intent(mContext, HandlerActivity.class));
        } else if (id == R.id.btn_send_large_view_notification) {
            NotifyUtils.getInstance(mContext).largeViewNotify("标题", "内容", new Intent(mContext, HandlerActivity.class));
        } else if (id == R.id.btn_send_large_img_notification) {
            NotifyUtils.getInstance(mContext).largeImgNotify(BitmapFactory.decodeResource(getResources(), R.drawable.icon_car), new Intent(mContext, HandlerActivity.class));
        }
    }
}
