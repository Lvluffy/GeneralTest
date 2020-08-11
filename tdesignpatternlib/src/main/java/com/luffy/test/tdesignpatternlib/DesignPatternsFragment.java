package com.luffy.test.tdesignpatternlib;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.IntentUtils;

import java.util.Arrays;

import butterknife.BindView;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 设计模式
 */
public class DesignPatternsFragment extends BaseFragment {

    @BindView(R2.id.listView)
    ListView listView;

    private DesignPatternsAdapter mAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_design_patterns, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = new DesignPatternsAdapter(mContext);
        mAdapter.updateData(Arrays.asList(DesignPatternsModel.values()));
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IntentUtils.getInstance().startActivity(mContext, mAdapter.getItem(position).getaClass(), new IntentUtils.IntentExtra() {
                    @Override
                    public Intent putExtra(Intent intent) {
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        return intent;
                    }
                });
            }
        });
    }
}
