package com.luffy.test.android.ui.owner.nfc;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.AppUtils;
import com.luffy.utils.generallib.FragmentUtils;

/**
 * Created by lvlufei on 2020-08-26
 *
 * @name
 */
public class NFCActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWriteSettings();
    }

    /**
     * 申请权限
     */
    private void requestWriteSettings() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.System.canWrite(mContext)) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                intent.setData(Uri.parse("package:" + AppUtils.getInstance().getAppPackName(mContext)));
                startActivityForResult(intent, 0);
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                //Settings.System.canWrite方法检测授权结果
                if (Settings.System.canWrite(mContext)) {
                    Log.d(TAG, "获取了权限");
                    FragmentUtils.getInstance().replaceFragment(this, new NFCFragment());
                } else {
                    Log.d(TAG, "您拒绝了权限");
                    finish();
                }
            }
        }
    }
}
