package com.luffy.test.tdesignpatternlib.create.abstractFactory.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.create.abstractFactory.patterns.Farm;
import com.luffy.test.tdesignpatternlib.create.abstractFactory.patterns.No1Farm;
import com.luffy.test.tdesignpatternlib.create.abstractFactory.patterns.No2Farm;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 抽象工厂
 */
public class AbstractFactoryFragment extends BaseFragment {

    @BindView(R2.id.txt_no1_farm)
    TextView txtNo1Farm;
    @BindView(R2.id.txt_no2_farm)
    TextView txtNo2Farm;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_abstract_factory, container, false);
    }

    @OnClick({R2.id.btn_no1_farm,
            R2.id.btn_no2_farm})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_no1_farm) {
            no1Farm();
        } else if (id == R.id.btn_no2_farm) {
            no2Farm();
        }
    }

    private void no1Farm() {
        Farm farm = new No1Farm();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(farm.name()).append(":");
        stringBuilder.append(farm.createAnimal().show()).append(",");
        stringBuilder.append(farm.createPlant().show()).append(".");
        txtNo1Farm.setText(stringBuilder.toString());
    }

    private void no2Farm() {
        Farm farm = new No2Farm();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(farm.name()).append(":");
        stringBuilder.append(farm.createAnimal().show()).append(",");
        stringBuilder.append(farm.createPlant().show()).append(".");
        txtNo2Farm.setText(stringBuilder.toString());
    }
}
