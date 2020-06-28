package com.luffy.test.android.ui;

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

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);
        ButterKnife.bind(this);
    }

    private void init() {
        Bundle bundle = getContentResolver().call(Uri.parse("content://com.miui.tsmclient.provider.feature"), "feature", null, null);
        txtContent.setText("值：" + log(bundle.getInt("feature_value"), 2));
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
            init();
        }
    }
}
