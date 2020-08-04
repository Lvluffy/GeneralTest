package com.luffy.test.android.ui.owner.link;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by lvlufei on 2020-07-29
 *
 * @name AppLink
 */
public class LinkTestFragment extends BaseFragment {

    @BindView(R2.id.txt_content)
    TextView txtContent;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_link_test, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtContent.setText(getArguments() == null ? "null" : getArguments().toString());
    }
}
