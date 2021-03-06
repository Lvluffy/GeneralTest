package com.luffy.test.android.ui.module.provider;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.AppUtils;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-20
 *
 * @name 内容提供者
 */
public class ProviderFragment extends BaseFragment {

    private static final String URI_STRING = "content://%1$s.provider.feature";
    public static final String METHOD_KEY = "test";
    public static final String METHOD_VALUE = "test_value";

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_provider, container, false);
    }

    @OnClick({R2.id.btn})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn) {
            parseIntent();
        }
    }

    private void parseIntent() {
        try {
            Bundle bundle = mActivity.getContentResolver().call(
                    Uri.parse(String.format(URI_STRING, AppUtils.getInstance().getAppPackName(mContext))),
                    METHOD_KEY,
                    null,
                    null);
            txtContent.setText(bundle.getString(METHOD_VALUE));
        } catch (Exception e) {
            txtContent.setText("");
        }
    }

}
