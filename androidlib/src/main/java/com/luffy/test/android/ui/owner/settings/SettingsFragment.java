package com.luffy.test.android.ui.owner.settings;

import android.Manifest;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;
import com.luffy.utils.rxlib.PermissionUtils;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-20
 *
 * @name Settings
 */
public class SettingsFragment extends BaseFragment {

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @OnClick({R2.id.btn_put, R2.id.btn_get})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_put) {
            /*动态申请获取手机信息权限*/
            PermissionUtils.getInstance().meanWhileApplyMultiPermission(
                    mActivity,
                    new PermissionUtils.MeanWhileApplyPermissionCallBack() {
                        @Override
                        public void onSucceed() {
                            Settings.Secure.putString(mActivity.getContentResolver(), "test_key", "我是写的数据");
                        }

                        @Override
                        public void onFailure() {
                            Toast.makeText(mActivity, "权限申请失败", Toast.LENGTH_SHORT).show();
                        }
                    },
                    Manifest.permission.WRITE_SECURE_SETTINGS
            );

        } else if (id == R.id.btn_get) {
            txtContent.setText(Settings.Secure.getString(mActivity.getContentResolver(), "test_key"));
        }
    }
}
