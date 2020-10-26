package com.luffy.test.android.ui.ipc.contentProvider;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-10-23
 *
 * @name 跨进程通讯-内容提供者
 */
public class IPCContentProviderFragment extends BaseFragment {

    private static final String URI_STRING = "content://com.aoji.liuxue.provider.feature";
    public static final String METHOD_KEY = "aoji";
    public static final String METHOD_VALUE = "aoji_value";

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ipccontent, container, false);
    }

    @OnClick(R2.id.btn_invoke)
    public void onViewClicked() {
        parseIntent();
    }

    private void parseIntent() {
        try {
            Bundle bundle = mActivity.getContentResolver().call(
                    Uri.parse(URI_STRING),
                    METHOD_KEY,
                    null,
                    null);
            Toast.makeText(mContext, bundle.getString(METHOD_VALUE), Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
