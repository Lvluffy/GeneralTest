package com.luffy.test.android.ui.owner.link;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import com.luffy.test.android.base.BaseActivity;

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
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(android.R.id.content, linkTestFragment).commitAllowingStateLoss();
    }
}
