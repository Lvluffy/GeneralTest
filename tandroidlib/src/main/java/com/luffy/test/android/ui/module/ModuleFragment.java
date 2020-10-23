package com.luffy.test.android.ui.module;

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
 * Created by lvlufei on 2020-10-23
 *
 * @name Android组件
 */
public class ModuleFragment extends BaseFragment {

    @BindView(R2.id.listView)
    ListView listView;

    private ModuleAdapter mModuleAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_module, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mModuleAdapter = new ModuleAdapter(mContext);
        mModuleAdapter.updateData(Arrays.asList(ModuleModel.values()));
        listView.setAdapter(mModuleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IntentUtils.getInstance().startActivity(mContext, mModuleAdapter.getItem(position).mClass);
            }
        });
    }

}
