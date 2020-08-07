package com.luffy.test.designpatternslib.structure.proxy.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.structure.proxy.patterns.TyProxy;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 代理
 */
public class ProxyFragment extends BaseFragment {

    @BindView(R2.id.listView)
    ListView listView;
    @BindView(R2.id.txt_content)
    TextView txtContent;

    private ProxyAdapter mAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_proxy, container, false);
    }

    @OnClick(R2.id.btn_query)
    public void onViewClicked() {
        query();
    }

    private void query() {
        TyProxy tyProxy = new TyProxy();
        //显示
        txtContent.setText(tyProxy.display());
        //列表
        mAdapter = new ProxyAdapter(mContext);
        mAdapter.updateData(Arrays.asList(tyProxy.kind()));
        listView.setAdapter(mAdapter);
    }

}
