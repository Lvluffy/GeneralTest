package com.luffy.test.android.ui.owner.provider;

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

/**
 * Created by lvlufei on 2020-07-08
 *
 * @name 内容提供者
 */
public class ProviderActivity extends BaseActivity {

    private static final String TSM_CLIENT_PROVIDER_FEATURE = "content://com.luffy.test.provider.feature";
    public static final String METHOD_KEY = "test";
    public static final String METHOD_VALUE = "test_value";

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn) {
            parseIntent();
        }
    }

    private void parseIntent() {
        try {
            Bundle bundle = getContentResolver().call(
                    Uri.parse(TSM_CLIENT_PROVIDER_FEATURE),
                    METHOD_KEY,
                    null,
                    null);
            txtContent.setText(bundle.getString(METHOD_VALUE));
        } catch (Exception e) {
            txtContent.setText("");
        }
    }
}
