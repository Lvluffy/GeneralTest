package com.luffy.test.android.ui.provider;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContentProviderActivity extends BaseActivity {

    private static final String TSM_CLIENT_PROVIDER_FEATURE = "content://com.miui.tsmclient.provider.feature";
    private static final String TSM_CLIENT_PROVIDER_FEATURE_METHOD = "feature";
    private static final String TSM_CLIENT_PROVIDER_FEATURE_KEY = "feature_value";

    public static final int FEATURE_SUPPORT_TSMCLIENT = 0x0000001;
    // 与FEATURE_SUPPORT_NFC匹配支持，其他都不支持
    public static final int FEATURE_SUPPORT_NFC = 0x0000002;
    public static final int FEATURE_SUPPORT_UNI_SETTINGS = 1 << 8;
    public static final int FEATURE_SUPPORT_SCAN_PAY = 1 << 9;

    private int mFeatureCode;

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);
        ButterKnife.bind(this);
    }

    private void parseTsmClientFeatureCode() {
        try {
            Bundle bundle = getContentResolver().call(
                    Uri.parse(TSM_CLIENT_PROVIDER_FEATURE),
                    TSM_CLIENT_PROVIDER_FEATURE_METHOD,
                    null,
                    null);
            // 第一位代表支持tsmclient，第二位代表支持nfc，第八位代表支持智能卡设置，第九位代表支持扫码支付
            mFeatureCode = bundle.getInt(TSM_CLIENT_PROVIDER_FEATURE_KEY);
            txtContent.setText("值：" + log(mFeatureCode, 2));
        } catch (Exception e) {
            // todo
            txtContent.setText("值：" + 0);
        } finally {
            // todo
        }
    }

    // 示例是支持扫码支付，其他类似
    public boolean isSupportScanPay() {
        boolean isSupport = (mFeatureCode & FEATURE_SUPPORT_SCAN_PAY) != 0;
        return isSupport;
    }

    /**
     * 对数计算
     *
     * @param value
     * @param base
     * @return
     */
    private int log(double value, double base) {
        return (int) (Math.log(value) / Math.log(base));
    }

    @OnClick({R2.id.btn})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn) {
            parseTsmClientFeatureCode();
        }
    }
}
