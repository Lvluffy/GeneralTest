package com.luffy.test.android.ui.owner.link;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.android.base.BaseFragment;

import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-07-29
 *
 * @name AppLink
 */
public class LinkFragment extends BaseFragment {

    private String uri = "test://com.luffy.linktest?name=张三&sex=女&age=18";

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_link, container, false);
    }

    @OnClick(R2.id.btn_link)
    public void onViewClicked() {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));
    }
}
