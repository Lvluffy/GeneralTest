package com.luffy.generaltest;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.luffy.test.tbaselayerlib.base.BaseActivity;
import com.luffy.utils.generallib.IntentUtils;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.listView)
    ListView listView;

    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initAdapter();
    }

    private void initAdapter() {
        mAdapter = new MainAdapter(mContext);
        mAdapter.updateData(Arrays.asList(MainModel.values()));
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IntentUtils.getInstance().startActivity(mContext, mAdapter.getItem(position).mClass);
            }
        });
    }

}
