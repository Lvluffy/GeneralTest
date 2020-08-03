package com.luffy.generaltest;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.luffy.test.android.base.BaseActivity;
import com.luffy.utils.generallib.IntentUtils;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.listView)
    ListView listView;

    private MainAdapter mMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initAdapter();
    }

    private void initAdapter() {
        mMainAdapter = new MainAdapter(mContext);
        mMainAdapter.updateData(Arrays.asList(MainModel.values()));
        listView.setAdapter(mMainAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IntentUtils.getInstance().startActivity(mContext, mMainAdapter.getItem(position).getaClass());
            }
        });
    }

}
