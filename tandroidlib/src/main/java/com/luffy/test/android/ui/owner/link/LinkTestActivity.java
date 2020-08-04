package com.luffy.test.android.ui.owner.link;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.FragmentUtils;

import java.util.Set;

/**
 * Created by lvlufei on 2020-07-29
 *
 * @name AppLink
 */
public class LinkTestActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = new Bundle();
        Uri uri = getIntent().getData();
        if (uri != null) {
            Log.v(TAG, "uri:" + uri.toString());
            Log.v(TAG, "scheme:" + uri.getScheme());
            Log.v(TAG, "host:" + uri.getHost());
            Set<String> parameterNames = uri.getQueryParameterNames();
            for (String name : parameterNames) {
                Log.v(TAG, name + ":" + uri.getQueryParameter(name));
                bundle.putString(name, uri.getQueryParameter(name));
            }
        }
        if (getIntent().getExtras() == null) {
            Log.v(TAG, "getIntent().getExtras():null");
        } else {
            Log.v(TAG, getIntent().getExtras().toString());
        }
        LinkTestFragment linkTestFragment = new LinkTestFragment();
        linkTestFragment.setArguments(bundle);
        FragmentUtils.getInstance().replaceFragment(this, linkTestFragment);
    }
}
