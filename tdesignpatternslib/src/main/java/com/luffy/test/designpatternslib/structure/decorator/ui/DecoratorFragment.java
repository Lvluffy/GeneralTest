package com.luffy.test.designpatternslib.structure.decorator.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.designpatternslib.R2;
import com.luffy.test.designpatternslib.structure.decorator.patterns.Belle;
import com.luffy.test.designpatternslib.structure.decorator.patterns.CityBeauty;
import com.luffy.test.designpatternslib.structure.decorator.patterns.Military;
import com.luffy.test.designpatternslib.structure.decorator.patterns.Original;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 装饰
 */
public class DecoratorFragment extends BaseFragment {

    @BindView(R2.id.txt_original)
    TextView txtOriginal;
    @BindView(R2.id.txt_city_beauty)
    TextView txtCityBeauty;
    @BindView(R2.id.txt_military)
    TextView txtMilitary;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_decorator, container, false);
    }

    @OnClick({
            R2.id.btn_original,
            R2.id.btn_city_beauty,
            R2.id.btn_military})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_original) {
            original();
        } else if (id == R.id.btn_city_beauty) {
            cityBeaut();
        } else if (id == R.id.btn_military) {
            military();
        }
    }

    private void original() {
        Belle belle = new Original();
        txtOriginal.setText(belle.display());
    }

    private void cityBeaut() {
        Belle belle = new CityBeauty(new Original());
        txtCityBeauty.setText(belle.display());
    }

    private void military() {
        Belle belle = new Military(new Original());
        txtMilitary.setText(belle.display());
    }


}
