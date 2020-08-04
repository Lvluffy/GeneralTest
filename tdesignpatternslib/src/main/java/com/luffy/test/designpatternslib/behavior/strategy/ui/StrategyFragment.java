package com.luffy.test.designpatternslib.behavior.strategy.ui;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luffy.test.designpatternslib.R;
import com.luffy.test.tbaselayerlib.base.BaseFragment;

/**
 * Created by lvlufei on 2020-08-04
 *
 * @name 策略
 */
public class StrategyFragment extends BaseFragment {

    @Override
    public View doCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_strategy, container, false);
    }

}
