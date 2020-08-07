package com.luffy.test.designpatternslib.structure.adapter.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.structure.adapter.patterns.ElectricAdapter;
import com.luffy.test.designpatternslib.structure.adapter.patterns.Motor;
import com.luffy.test.designpatternslib.structure.adapter.patterns.OpticalAdapter;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 适配器
 */
public class AdapterFragment extends BaseFragment {

    @BindView(R2.id.txt_electric_adapter)
    TextView txtElectricAdapter;
    @BindView(R2.id.txt_optical_adapter)
    TextView txtOpticalAdapter;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_adapter, container, false);
    }

    @OnClick({R2.id.btn_electric_adapter,
            R2.id.btn_optical_adapter})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_electric_adapter) {
            electricAdapter();
        } else if (id == R.id.btn_optical_adapter) {
            opticalAdapter();
        }
    }

    private void electricAdapter() {
        Motor motor = new ElectricAdapter();
        txtElectricAdapter.setText(motor.drive());
    }

    private void opticalAdapter() {
        Motor motor = new OpticalAdapter();
        txtOpticalAdapter.setText(motor.drive());
    }
}
