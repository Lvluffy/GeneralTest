package com.luffy.test.android.ui.module.broadCast;

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
 * Created by lvlufei on 2020-09-29
 *
 * @name 注册广播
 */
public class BroadCastRegisterFragment extends BaseFragment {

    @BindView(R2.id.listView)
    ListView listView;

    private BroadCastRegisterAdapter mAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_receiver_register, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = new BroadCastRegisterAdapter(mContext);
        mAdapter.updateData(Arrays.asList(BroadCastRegisterModel.values()));
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IntentUtils.getInstance().startActivity(mContext, mAdapter.getItem(position).mClass);
            }
        });
    }

}
