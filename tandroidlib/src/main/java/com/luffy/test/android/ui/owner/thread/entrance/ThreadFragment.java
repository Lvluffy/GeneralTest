package com.luffy.test.android.ui.owner.thread.entrance;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.luffy.test.android.R;
import com.luffy.test.android.R2;
import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.utils.generallib.IntentUtils;

import java.util.Arrays;

import butterknife.BindView;

/**
 * Created by lvlufei on 2020-08-14
 *
 * @name 线程
 */
public class ThreadFragment extends BaseFragment {

    @BindView(R2.id.listView)
    ListView listView;

    private ThreadAdapter mAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_thread, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
    }

    private void initAdapter() {
        mAdapter = new ThreadAdapter(mContext);
        mAdapter.updateData(Arrays.asList(ThreadModel.values()));
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IntentUtils.getInstance().startActivity(mActivity, mAdapter.getItem(position).getaClass());
            }
        });
    }
}
