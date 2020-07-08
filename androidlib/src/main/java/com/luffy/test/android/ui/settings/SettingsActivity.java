package com.luffy.test.android.ui.settings;

import android.Manifest;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.utils.rxlib.PermissionUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name Settings
 */
public class SettingsActivity extends AppCompatActivity {

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn_put, R2.id.btn_get})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_put) {
            /*动态申请获取手机信息权限*/
            PermissionUtils.getInstance().meanWhileApplyMultiPermission(
                    SettingsActivity.this,
                    new PermissionUtils.MeanWhileApplyPermissionCallBack() {
                        @Override
                        public void onSucceed() {
                            Settings.Secure.putString(getContentResolver(), "test_key", "我是写的数据");
                        }

                        @Override
                        public void onFailure() {
                            Toast.makeText(SettingsActivity.this, "权限申请失败", Toast.LENGTH_SHORT).show();
                        }
                    },
                    Manifest.permission.WRITE_SECURE_SETTINGS
            );

        } else if (id == R.id.btn_get) {
            txtContent.setText(Settings.Secure.getString(getContentResolver(), "test_key"));
        }
    }
}
