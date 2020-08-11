package com.luffy.test.tdesignpatternlib.behavior.strategy.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.behavior.strategy.patterns.BraisedCrabs;
import com.luffy.test.tdesignpatternlib.behavior.strategy.patterns.Kitchen;
import com.luffy.test.tdesignpatternlib.behavior.strategy.patterns.SteamedCrabs;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 策略
 */
public class StrategyFragment extends BaseFragment {

    @BindView(R2.id.txt_steamed)
    TextView txtSteamed;
    @BindView(R2.id.img_steamed)
    ImageView imgSteamed;
    @BindView(R2.id.txt_braised)
    TextView txtBraised;
    @BindView(R2.id.img_braised)
    ImageView imgBraised;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_strategy, container, false);
    }

    @OnClick({R2.id.btn_steamed, R2.id.btn_braised})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_steamed) {
            steamed();
        } else if (id == R.id.btn_braised) {
            braised();
        }
    }

    private void steamed() {
        Kitchen kitchen = new Kitchen(new SteamedCrabs());
        txtSteamed.setText(kitchen.cookingMethod());
        imgSteamed.setImageResource(kitchen.getImage());
    }

    private void braised() {
        Kitchen kitchen = new Kitchen(new BraisedCrabs());
        txtBraised.setText(kitchen.cookingMethod());
        imgBraised.setImageResource(kitchen.getImage());
    }
}
