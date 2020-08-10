package com.luffy.test.designpatternslib.structure.facade.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.structure.facade.patterns.SxSpecialty;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 外观
 */
public class FacadeFragment extends BaseFragment {

    @BindView(R2.id.listView)
    ListView listView;

    private FacadeAdapter mAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_facade, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = new FacadeAdapter(mContext);
        listView.setAdapter(mAdapter);
    }

    @OnClick(R2.id.btn_query)
    public void onViewClicked() {
        SxSpecialty sxSpecialty = new SxSpecialty();
        mAdapter.updateData(sxSpecialty.getList());
    }
}
