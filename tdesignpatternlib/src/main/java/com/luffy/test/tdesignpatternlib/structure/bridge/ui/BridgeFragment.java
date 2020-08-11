package com.luffy.test.tdesignpatternlib.structure.bridge.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.luffy.test.tbaselayerlib.base.BaseFragment;
import com.luffy.test.tdesignpatternlib.R;
import com.luffy.test.tdesignpatternlib.R2;
import com.luffy.test.tdesignpatternlib.structure.bridge.patterns.Bag;
import com.luffy.test.tdesignpatternlib.structure.bridge.patterns.HandBag;
import com.luffy.test.tdesignpatternlib.structure.bridge.patterns.Red;
import com.luffy.test.tdesignpatternlib.structure.bridge.patterns.Wallet;
import com.luffy.test.tdesignpatternlib.structure.bridge.patterns.Yellow;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by lvlufei on 2020-08-05
 *
 * @name 桥接
 */
public class BridgeFragment extends BaseFragment {

    @BindView(R2.id.txt_yellow_bag)
    TextView txtYellowBag;
    @BindView(R2.id.txt_red_bag)
    TextView txtRedBag;

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bridge, container, false);
    }

    @OnClick({R2.id.btn_yellow_bag, R2.id.btn_red_bag})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.btn_yellow_bag) {
            yellowBag();
        } else if (id == R.id.btn_red_bag) {
            redBag();
        }
    }

    private void yellowBag() {
        Bag bag = new Wallet(new Yellow());
        txtYellowBag.setText(bag.getColor().getColor() + bag.getName());
    }

    private void redBag() {
        Bag bag = new HandBag(new Red());
        txtRedBag.setText(bag.getColor().getColor() + bag.getName());
    }
}
